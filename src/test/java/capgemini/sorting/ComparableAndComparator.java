package capgemini.sorting;

import capgemini.entities.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableAndComparator{

    public static void main(String[] args) {

        Student s1 = new Student(1, "Amit");
        Student s2 = new Student(2, "Vikas");
        Student s3 = new Student(3, "Meenakashi");

        List<Student> studentList =new ArrayList<>();
        studentList.add(s3);
        studentList.add(s1);
        studentList.add(s2);

        System.out.println("=====Before Sorting=====");
        studentList.forEach(student -> System.out.println(student.getName()));
        System.out.println("========================");
        Collections.sort(studentList);
        System.out.println("=====After Comparable=====");
        studentList.forEach(student -> System.out.println(student.getName()));
        System.out.println("========================");

        studentList =new ArrayList<>();
        studentList.add(s3);
        studentList.add(s1);
        studentList.add(s2);

        Comparator<Student> comparatorIncreasing = (student1, student2) -> Integer.compare(student1.getRollNumber(), student2.getRollNumber());
        System.out.println("=====After Increasing Comparator=====");
        studentList.sort(comparatorIncreasing);
        studentList.forEach(student -> System.out.println(student.getName()));
        System.out.println("========================");

        System.out.println("=====After decreasing Comparator=====");
        Comparator<Student> comparatorDecreasing = (student1, student2) -> Integer.compare(student2.getRollNumber(), student1.getRollNumber());
        studentList.sort(comparatorDecreasing);
        studentList.forEach(student -> System.out.println(student.getName()));
        System.out.println("========================");

    }
}
