package org.school.repository;

import org.school.entity.Student;

import java.util.List;

public interface StudentRepository {
    boolean isDbUp();
    boolean addStudent(Student student);
    boolean addStudentInBulk(List<Student> student);
}
