package com.romro.main;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.romro.main.Services.StudentServices;
import com.romro.main.Services.StudentServiceImpl;
import com.romro.main.entity.Student;

/**
 * Main class for the Spring Boot application.
 * 
 * This class serves as the entry point for the application, initializing the Spring Boot framework.
 * It also contains commented-out test methods for performing CRUD operations on the Student entity.
 * These methods can be uncommented and used for testing or future implementations.
 * 
 * The application uses Spring Data JPA for database interactions, making use of 
 * {@link StudentServices} to perform various operations.
 */
@SpringBootApplication
public class SpringBootDataJpa1Application {

    public static void main(String[] args) {
        // Bootstrapping the Spring application and obtaining the application context
        ApplicationContext context = SpringApplication.run(SpringBootDataJpa1Application.class, args);
        
        // Fetching the StudentServices bean from the Spring context
		StudentServices studentServices = context.getBean(StudentServiceImpl.class);

        // =====================================================================
        // INSERT OPERATION (Add a new student)
        // =====================================================================
        /*
        * This method creates a new Student entity, sets its attributes, 
        * and saves it to the database using StudentServices.
        * 
        * Expected Output:
        * - If successful, prints: "## Student inserted successfully ##"
        * - If unsuccessful, prints: "## Student insertion failed ##"
        */
        /*
        Student student = new Student();
        student.setName("Romeo Parajuli Coder");
        student.setRollNumber(222);
        student.setMarks(45.33f);

        boolean status = studentServices.addStudentDetails(student);
        if (status)
            System.out.println("## Student inserted successfully ##");
        else
            System.err.println("## Student insertion failed ##");
        */

        // =====================================================================
        // RETRIEVE ALL STUDENTS
        // =====================================================================
        /*
        * This method fetches all student records from the database.
        * 
        * Expected Output:
        * - Displays the list of students along with their ID, Name, Roll Number, and Marks.
        * - If no students exist, an empty list is returned.
        */
        /*
        List<Student> studentList = studentServices.getAllStudent();
        for (Student student : studentList) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Marks: " + student.getMarks());
            System.out.println("=====================================");
        }
        */

        // =====================================================================
        // RETRIEVE A STUDENT BY ID
        // =====================================================================
        /*
        * This method fetches a specific student record from the database based on the provided ID.
        * 
        * Expected Output:
        * - If the student exists, their details are displayed.
        * - If no student is found with the given ID, prints: "## Student not found ##"
        */
        /*
        Student student = studentServices.getStudentDetails(8);
        if (student != null) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Marks: " + student.getMarks());
        } else {
            System.err.println("## Student not found ##");
        }
        */

        // =====================================================================
        // UPDATE STUDENT MARKS BY ID
        // =====================================================================
        /*
        * This method updates the marks of an existing student using their ID.
        * 
        * Expected Output:
        * - If successful, prints: "## Student updated successfully ##"
        * - If the student ID does not exist, prints: "## Student update failed ##"
        */
        /*
        boolean updateStatus = studentServices.updateStudentDetails(1, 90.3f);
        if (updateStatus) 
            System.out.println("## Student updated successfully ##");
        else 
            System.err.println("## Student update failed ##");
        */

        // =====================================================================
        // DELETE STUDENT BY ID
        // =====================================================================
        /*
        * This method deletes a student record from the database based on the given ID.
        * 
        * Expected Output:
        * - If successful, prints: "## Student deleted successfully ##"
        * - If the deletion fails (e.g., ID not found), prints: "## Student deletion failed ##"
        */
        boolean deleteStatus = studentServices.deleteStudent(1);
        if (deleteStatus) 
            System.out.println("## Student deleted successfully ##");
        else 
            System.err.println("## Student deletion failed ##");
    }
}
