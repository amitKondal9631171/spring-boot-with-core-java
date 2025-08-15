package org.school.service;

import org.school.entity.Student;

import java.util.Comparator;
import java.util.List;

public interface StudentService {


    boolean isDbUp();

    boolean addStudent(Student student);

    boolean addStudentInBulk(List<Student> student);

    Student fetchStudent (int studentId);

    boolean updateStudent (Student studentInfo);

    boolean deleteStudent (int studentId);

    List<Student> fetchAllStudent ();

    List<Student> fetchStudentOrderByName ();

    List<Student> fetchStudentOrderByRollNumber ();

    List<String> processOtherProducts (List<String> input);

    List<String> processTreadAndFinanceProducts ( List<String> input);

    default List<Student> fetchStudentInOrder(Comparator<Student> studentComparator, List<Student> studentList){


        return null;
    }
}
