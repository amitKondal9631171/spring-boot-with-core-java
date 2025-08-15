package org.school.repository;


import org.school.entity.Student;

import java.util.List;

@FunctionalInterface
public interface StudentInformation {

    List<Student> getStudentInformation();


    default void studentStatistics(List<Student> students){



    }

}
