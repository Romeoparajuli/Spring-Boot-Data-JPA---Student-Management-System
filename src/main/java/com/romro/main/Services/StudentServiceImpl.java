package com.romro.main.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romro.main.Repository.StudentRepository;
import com.romro.main.entity.Student;

/**
 * Service implementation for managing Student-related operations.
 * 
 * This class provides the actual business logic for adding, retrieving, updating, and deleting student records.
 * It interacts with the {@link StudentRepository} to perform database operations.
 */
@Service
public class StudentServiceImpl implements StudentServices {

    @Autowired
    private StudentRepository studentRepository;

    /**
     * Adds a new student record to the database.
     *
     * @param student The student entity to be added.
     * @return true if the operation is successful, false otherwise.
     */
    @Override
    public boolean addStudentDetails(Student student) {
        try {
            studentRepository.save(student);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Retrieves all students from the database.
     *
     * @return A list of all student entities.
     */
    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    /**
     * Retrieves details of a specific student based on the provided ID.
     *
     * @param id The unique identifier of the student.
     * @return The student entity if found, otherwise null.
     */
    @Override
    public Student getStudentDetails(long id) {
        Optional<Student> optional = studentRepository.findById(id);
        return optional.orElse(null);
    }

    /**
     * Updates the marks of a specific student.
     *
     * @param id The unique identifier of the student.
     * @param marks The updated marks to be assigned.
     * @return true if the update is successful, false otherwise.
     */
    @Override
    public boolean updateStudentDetails(long id, float marks) {
        Student student = getStudentDetails(id);
        if (student != null) {
            student.setMarks(marks);
            studentRepository.save(student);
            return true;
        }
        return false;
    }

    /**
     * Deletes a student record from the database.
     *
     * @param id The unique identifier of the student to be deleted.
     * @return true if the deletion is successful, false otherwise.
     */
    @Override
    public boolean deleteStudent(long id) {
        try {
            studentRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
