package com.learning.repository;

import com.learning.entity.Student;

import java.util.List;

public interface StudentRepository {
    boolean isDbUp();
    boolean addStudent(Student student);
    boolean addStudentInBulk(List<Student> student);
}
