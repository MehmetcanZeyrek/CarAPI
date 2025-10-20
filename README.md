🏎️ CarAPI

CarAPI is a Spring Boot–based RESTful web service designed to manage car-related data, including brands, models, and file uploads.
It follows a clean layered architecture (Controller → Service → Repository) and includes built-in exception handling, logging, and configuration management.

🚀 Features

CRUD operations for:

Cars

Brands

Models

File upload & storage (via MinIO)

Centralized exception handling

AOP-based logging

Global configuration support

Dockerfile included for containerized deployment

Scheduled tasks example

Mapper layer for DTO–Entity transformations

CarAPI/
 ├── src/
 │   ├── main/java/com/mehmetcan/
 │   │   ├── configuration/        # App & DataSource configurations
 │   │   ├── controller/           # REST controllers
 │   │   ├── dto/                  # Data Transfer Objects
 │   │   ├── entities/             # JPA entities
 │   │   ├── exception/            # Custom exceptions
 │   │   ├── handler/              # Global exception handlers
 │   │   ├── repository/           # Spring Data JPA repositories
 │   │   ├── service/              # Business logic layer
 │   │   ├── aop/                  # Logging aspects
 │   │   ├── scheduled/            # Scheduled tasks example
 │   │   └── VforvicApplication.java  # Main Spring Boot class
 │   └── resources/
 │       ├── application.yml        # Application configuration
 │       └── ...
 ├── pom.xml                        # Maven dependencies
 ├── Dockerfile                     # Container setup
 ├── HELP.md                        # Spring Boot help reference
 └── README.md                      # (this file)

 ⚙️ Tech Stack
Category	Technology
Backend Framework	Spring Boot
Database	MySQL / PostgreSQL (configurable)
Object Mapping	MapStruct or custom MapperService
File Storage	MinIO
Build Tool	Maven
Containerization	Docker
Language	Java 17+


🔧 Setup & Installation

Clone the repository

git clone https://github.com/yourusername/CarAPI.git
cd CarAPI


Configure application.yml

Set your database connection and MinIO credentials.

Build the project

mvn clean install


Run the application

mvn spring-boot:run


or with Docker:

docker build -t carapi .
docker run -p 8080:8080 carapi

🧩 API Endpoints (Examples)
Method	Endpoint	Description
GET	/api/cars	Get all cars
GET	/api/cars/{id}	Get car by ID
POST	/api/cars	Create new car
PUT	/api/cars/{id}	Update car
DELETE	/api/cars/{id}	Delete car
POST	/api/files/upload	Upload file
🛡️ Error Handling

Centralized exception handling is implemented using:

GlobalExceptionHandler

ApiError model
Ensures consistent error response structure across all endpoints.

🧠 Logging

Uses Aspect-Oriented Programming (AOP) via LoggingAspect to log method execution and API activity in a non-intrusive way.

🕒 Scheduled Tasks

ScheduleExample demonstrates how to set up recurring background tasks using Spring’s @Scheduled annotation.

🧰 Docker Support

The included Dockerfile allows you to containerize the application easily:

docker build -t carapi .
docker run -p 8080:8080 carapi






