# Spring Boot Data JPA - Student Management System

## 📌 Project Overview

This is a **Spring Boot** application that demonstrates **CRUD (Create, Read, Update, Delete)** operations using **Spring Data JPA** with a **MySQL database**. The project provides an API to manage student records, including functionalities to add, retrieve, update, and delete student details.

## 🚀 Technologies Used

- **Java 21**
- **Spring Boot 3.2.2**
- **Spring Data JPA**
- **Hibernate ORM**
- **MySQL Database**
- **Maven Build Tool**

## 📂 Project Structure

```
SpringBootDataJPA-1/
│── src/
│   ├── main/
│   │   ├── java/com/romro/main/
│   │   │   ├── entity/Student.java            # Student entity class
│   │   │   ├── repository/StudentRepository.java  # JPA Repository interface
│   │   │   ├── services/StudentServices.java   # Service interface
│   │   │   ├── services/StudentServiceImpl.java  # Service implementation
│   │   │   ├── SpringBootDataJpa1Application.java # Main entry point
│   │   ├── resources/
│   │   │   ├── application.properties          # Database and app configurations
│── pom.xml                                      # Maven dependencies
│── README.md                                    # Project documentation
```

## ⚙️ Setup & Installation

### Prerequisites

Ensure you have the following installed on your system:

- Java 21
- Maven
- MySQL Server

### Steps to Run the Project

1. **Clone the repository**
   ```sh
   git clone https://github.com/Romeoparajuli/SpringBootDataJPA-1.git
   cd SpringBootDataJPA-1
   ```
2. **Configure MySQL Database** Update `src/main/resources/application.properties` with your MySQL credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```
3. **Build & Run the Project**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```
4. **API Endpoints** The application provides the following RESTful APIs:
   - **GET** `/students` → Get all students
   - **GET** `/students/{id}` → Get a student by ID
   - **POST** `/students` → Add a new student
   - **PUT** `/students/{id}` → Update student marks
   - **DELETE** `/students/{id}` → Delete a student

## 🛠️ Testing the API

You can use **Postman** or **cURL** to test the endpoints:

```sh
curl -X GET http://localhost:8080/students
```

## 📜 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

## 🤝 Contribution Guidelines

- Fork the repository
- Create a new branch (`feature/your-feature`)
- Commit your changes (`git commit -m 'Add new feature'`)
- Push to the branch (`git push origin feature/your-feature`)
- Open a Pull Request

## 📧 Contact

For any queries or support, feel free to reach out:

- **Author:** Your Name
- **Email:** [your.email@example.com](mailto\:milankit123@gmail.com)
- **GitHub:** [Your GitHub Profile](https://github.com/Romeoparajuli))



