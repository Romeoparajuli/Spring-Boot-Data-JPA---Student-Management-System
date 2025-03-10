package com.romro.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.romro.main.entity.Student;

/**
 * Repository interface for managing Student entities.
 * 
 * Extends JpaRepository to provide built-in CRUD operations and pagination support.
 * 
 * No need to implement methods manually, as Spring Data JPA generates them automatically.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
