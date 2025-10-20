package com.mehmetcan.controller.concretes;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mehmetcan.entities.FileEntity;
import com.mehmetcan.repository.FileEntityRepository;

@RestController
public class FileController {
	
	@Autowired
	private FileEntityRepository fileEntityRepository;
	
	
	
	@PostMapping(path = "/upload")
	public String uploadFile(@RequestParam(name = "file") MultipartFile file) throws IllegalStateException, IOException {
		
		String path = System.getProperty("user.dir") + File.separator + "files";
		
		File uploadFile = new File(path);
		
		if(!uploadFile.exists()) {
			uploadFile.mkdirs();		}
		
		File file2 = new File(path);
		file.transferTo(file2);
		FileEntity fileEntity = new FileEntity();
		
		fileEntity.setOriginalFileName(file.getOriginalFilename());
		
		fileEntity.setPath(file2.getAbsolutePath());
		
		fileEntityRepository.save(fileEntity);
		
		return "upload basarili";
	}
	
	@GetMapping(path = "/download/{id}")
	public ResponseEntity<Resource> download(@PathVariable Long id) throws MalformedURLException{
		
		Optional<FileEntity> optional = fileEntityRepository.findById(id);
		
		File file = new File(optional.get().getPath());
		
		Resource resource = new UrlResource(file.toURI());
		
		String originalFileName = optional.get().getOriginalFileName();
		String encodedFileName = URLEncoder.encode(originalFileName, StandardCharsets.UTF_8);
		
		return ResponseEntity.ok()
			    .header(org.springframework.http.HttpHeaders.CONTENT_DISPOSITION, "attachment; filename*=UTF-8''" + encodedFileName)
			    .contentType(MediaType.APPLICATION_OCTET_STREAM)
			    .body(resource);
				
		
	}

}
