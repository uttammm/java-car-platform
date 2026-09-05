# Car Platform API

A RESTful API built with Java + Spring Boot for managing a car inventory platform.

## 🛠️ Tech Stack
- Java 21
- Spring Boot 4.1.0
- Spring Data JPA
- MySQL
- Maven

## 🚀 Getting Started

### Prerequisites
- Java 21+
- MySQL 8.0+
- Maven

### Setup
1. Clone the repository
   ```bash
   git clone https://github.com/uttam/java-car-platform.git
   ```
2. Create MySQL database
   ```sql
   CREATE DATABASE cardb;
   ```
3. Update `application.properties` with your MySQL credentials
4. Run the application
   ```bash
   ./mvnw spring-boot:run
   ```

## 📡 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/cars` | Get all cars |
| GET | `/cars/{id}` | Get car by ID |
| POST | `/cars` | Add a new car |
| PUT | `/cars/{id}` | Update a car |
| DELETE | `/cars/{id}` | Delete a car |

## 📦 Project Structure
```
src/main/java/com/uttam/carp/
├── controller/    — HTTP request handling
├── service/       — Business logic
├── repository/    — Database operations
├── model/         — Data models
└── exception/     — Exception handling
```

## 🔮 Roadmap
- [ ] JWT Authentication
- [ ] Request validation
- [ ] Unit testing
- [ ] Media storage (AWS S3)
- [ ] Microservices architecture
- [ ] GenAI chatbot# java-car-platform
Full-stack Java + Spring Boot Car selling platform.
