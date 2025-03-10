package com.romro.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity class representing a Student.
 * This class is mapped to the "Student" table in the database.
 * It includes basic attributes such as ID, name, roll number, and marks.
 * 
 * Annotations used:
 * - @Entity: Marks this class as a JPA entity.
 * - @Table: Indicates that this entity is mapped to a database table.
 */
@Entity
@Table
public class Student {

    /**
     * Unique identifier for the student.
     * Uses auto-incremented primary key generation.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    /** Name of the student. */
    @Column
    private String name;

    /** Roll number assigned to the student. */
    @Column
    private int rollNumber;

    /** Marks obtained by the student. */
    @Column
    private float marks;

    // Getter and Setter methods

    /**
     * Gets the student ID.
     * @return the unique student ID.
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the student ID.
     * @param id the unique student ID to set.
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the student name.
     * @return the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the student name.
     * @param name the name of the student to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the roll number of the student.
     * @return the student's roll number.
     */
    public int getRollNumber() {
        return rollNumber;
    }

    /**
     * Sets the roll number of the student.
     * @param rollNumber the roll number to set.
     */
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    /**
     * Gets the marks obtained by the student.
     * @return the student's marks.
     */
    public float getMarks() {
        return marks;
    }

    /**
     * Sets the marks obtained by the student.
     * @param marks the marks to set.
     */
    public void setMarks(float marks) {
        this.marks = marks;
    }
}
