package com.mehmetcan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mehmetcan.entities.FileEntity;

@Repository
public interface FileEntityRepository extends JpaRepository<FileEntity, Long> {

}
