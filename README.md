# Employee Management System

A RESTful Employee Management System built using **Spring Boot, Spring Data JPA, Hibernate, and MySQL**.

This project demonstrates how to build a backend application with CRUD operations for managing employee records and connecting a Spring Boot application with a MySQL database.

---

## 📌 Project Overview

The Employee Management System provides APIs to:

- Add a new employee
- Retrieve all employees
- Retrieve an employee by ID
- Retrieve employees by department
- Update employee information
- Delete an employee
- Delete all employees

The application follows a layered architecture with separate packages for:

- Controller
- Service
- Repository
- Entity
- Model

---

## 🛠️ Technologies Used

| Technology | Purpose |
|------------|---------|
| Java 21 | Programming Language |
| Spring Boot 4.1.1 | Backend Framework |
| Spring Data JPA | Database Access |
| Hibernate | ORM |
| MySQL | Relational Database |
| Maven | Dependency Management |
| IntelliJ IDEA | Development Environment |
| Postman | API Testing |

---

## 🏗️ Project Structure

EmployeeManagementSystem
│
├── src
│   └── main
│       ├── java
│       │   └── pcodes.jpaproject.ems
│       │       │
│       │       ├── controller
│       │       │   └── EmployeeController.java
│       │       │
│       │       ├── entity
│       │       │   └── Employee.java
│       │       │
│       │       ├── model
│       │       │   ├── EmployeeAddRequest.java
│       │       │   └── EmployeeAddResponse.java
│       │       │
│       │       ├── repository
│       │       │   └── EmployeeRepository.java
│       │       │
│       │       ├── service
│       │       │   └── EmployeeService.java
│       │       │
│       │       └── EmployeeManagementSystemApplication.java
│       │
│       └── resources
│           └── application.properties
│
├── .gitignore
├── pom.xml
└── README.md

---

## 🔄 Application Flow

Client / Postman
       │
       ▼
EmployeeController
       │
       ▼
EmployeeService
       │
       ▼
EmployeeRepository
       │
       ▼
Spring Data JPA / Hibernate
       │
       ▼
MySQL Database

---

## 🗄️ Database

The application uses a MySQL database named:

JPAEMS

The main table is:

Employees

### Employee Table

| Column | Type | Description |
|--------|------|-------------|
| id | BIGINT | Primary Key |
| fullName | VARCHAR | Employee's full name |
| email | VARCHAR | Employee email |
| department | VARCHAR | Employee department |
| salary | DOUBLE | Employee salary |

Hibernate/JPA manages the database table using the configured entity mappings.

---

## ⚙️ Configuration

The application uses the following database configuration:

spring.application.name=EmployeeManagementSystem

spring.datasource.url=jdbc:mysql://localhost:3306/JPAEMS
spring.datasource.username=root
spring.datasource.password=YOUR_DATABASE_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

server.port=8080

> ⚠️ Security: Never upload your actual database password to a public GitHub repository.

---

# 🚀 How to Run

## 1. Clone the Repository

git clone https://github.com/YOUR_USERNAME/EmployeeManagementSystem.git

## 2. Open the Project

Open the cloned project in IntelliJ IDEA.

## 3. Start MySQL

Make sure your MySQL server is running.

Create the database:

CREATE DATABASE JPAEMS;

## 4. Configure Database Credentials

Open:

src/main/resources/application.properties

and enter your local MySQL username and password.

## 5. Build the Project

Using Maven:

mvn clean install

On Windows, you can also use:

mvnw.cmd clean install

## 6. Run the Application

Run:

EmployeeManagementSystemApplication.java

The application will start at:

http://localhost:8080

---

# 📡 REST API Endpoints

Base URL:

http://localhost:8080

---

## 1. Add Employee

### POST

/employees

### Full URL

http://localhost:8080/employees

### Request Body

{
  "fullName": "Tannu Kumari",
  "email": "tannu@gmail.com",
  "department": "Data Science",
  "salary": 50000
}

---

## 2. Get All Employees

### GET

/employees/all

### Full URL

http://localhost:8080/employees/all

---

## 3. Get Employee by ID

### GET

/employees/{id}

### Example

http://localhost:8080/employees/1

---

## 4. Get Employees by Department

### GET

/employees/dept/{department}

### Example

http://localhost:8080/employees/dept/Data%20Science

---

## 5. Update Employee

### PUT

/employees/update/{id}

### Example

http://localhost:8080/employees/update/1

### Request Body

{
  "fullName": "Tannu Kumari",
  "email": "tannu.updated@gmail.com",
  "department": "Data Science",
  "salary": 60000
}

---

## 6. Delete Employee

### GET

/employees/delete/{id}

### Example

http://localhost:8080/employees/delete/1

---

## 7. Delete All Employees

### GET

/employees/delete/all

### Full URL

http://localhost:8080/employees/delete/all

---

# 🧪 Testing with Postman

The REST APIs can be tested using Postman.

### Example: Add Employee

Method:

POST

URL:

http://localhost:8080/employees

Body:

Body → raw → JSON

JSON:

{
  "fullName": "Tannu Kumari",
  "email": "tannu@gmail.com",
  "department": "Data Science",
  "salary": 50000
}

---

# 📂 Main Components

## Employee Entity

File:

Employee.java

Represents the employee table in the MySQL database using JPA entity mappings.

---

## Employee Controller

File:

EmployeeController.java

Handles HTTP requests and exposes REST API endpoints.

---

## Employee Service

File:

EmployeeService.java

Contains the business logic of the application.

---

## Employee Repository

File:

EmployeeRepository.java

Provides database operations using Spring Data JPA.

---

## EmployeeAddRequest

File:

EmployeeAddRequest.java

Represents employee data received from API requests.

---

## EmployeeAddResponse

File:

EmployeeAddResponse.java

Represents employee data returned as an API response.

---

# 🎯 Learning Objectives

This project was developed to practice:

- Spring Boot application development
- REST API development
- CRUD operations
- Spring Data JPA
- Hibernate ORM
- Entity mapping
- Repository pattern
- Service layer architecture
- Controller layer architecture
- MySQL integration
- Maven dependency management
- Postman API testing

---

# 🔮 Future Improvements

The project can be enhanced with:

- [ ] Input validation
- [ ] Global exception handling
- [ ] Search employees by name
- [ ] Pagination
- [ ] Sorting
- [ ] Swagger / OpenAPI documentation
- [ ] Improved API response structure
- [ ] Proper HTTP status responses
- [ ] Environment variables for database credentials
- [ ] Unit testing
- [ ] Integration testing
- [ ] Docker support

---

# 📈 Project Status

🟢 Current Status: Working

The current version implements the core employee management functionality using:

Spring Boot + Spring Data JPA + Hibernate + MySQL

Advanced features will be added in future versions.

---

# 👩‍💻 Author

Suhani Kumari

B.Tech Computer Science & Engineering
Data Science

---

## ⭐ Support

If you find this project useful for learning Spring Boot, JPA, and REST API development, consider giving the repository a ⭐ on GitHub.
