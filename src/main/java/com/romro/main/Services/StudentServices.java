package com.romro.main.Services;

import java.util.List;
import com.romro.main.entity.Student;

/**
 * Service interface for managing Student-related operations.
 * 
 * This interface defines methods for adding, retrieving, updating, and deleting student records.
 * Implementations of this interface should provide the actual business logic.
 */
public interface StudentServices {

    /**
     * Adds a new student record to the system.
     * 
     * @param student The student entity to be added.
     * @return true if the student is successfully added, false otherwise.
     */
    boolean addStudentDetails(Student student);

    /**
     * Retrieves a list of all students.
     * 
     * @return A list containing all student entities.
     */
    List<Student> getAllStudent();

    /**
     * Retrieves details of a specific student based on ID.
     * 
     * @param id The unique identifier of the student.
     * @return The student entity if found, otherwise null.
     */
    Student getStudentDetails(long id);

    /**
     * Updates the marks of a specific student.
     * 
     * @param id The unique identifier of the student.
     * @param marks The updated marks to be assigned.
     * @return true if the update is successful, false otherwise.
     */
    boolean updateStudentDetails(long id, float marks);

    /**
     * Deletes a student record based on ID.
     * 
     * @param id The unique identifier of the student to be deleted.
     * @return true if the deletion is successful, false otherwise.
     */
    boolean deleteStudent(long id);
}
