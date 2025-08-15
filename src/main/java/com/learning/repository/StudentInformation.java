package com.learning.repository;


import com.learning.entity.Student;

import java.util.List;

@FunctionalInterface
public interface StudentInformation {

    List<Student> getStudentInformation();


    default void studentStatistics(List<Student> students){



    }

}
