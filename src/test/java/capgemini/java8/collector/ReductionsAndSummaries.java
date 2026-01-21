package capgemini.java8.collector;

import capgemini.entities.Employee;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ReductionsAndSummaries {

    static List<Employee> empList = Arrays.asList(
            new Employee(1, "Amit", "IT", 1000),
            new Employee(2, "Rohit", "IT", 2000),
            new Employee(3, "Sita", "HR", 3000)
    );

    public static void main(String[] args) {

        //Count the number of employees.
        long count = empList.stream().collect(Collectors.counting());
        System.out.println("Count: " + count);

        //Sum the salary of employees.
        int sum = empList.stream().collect(Collectors.summingInt(Employee::getSalary));
        System.out.println("Sum: " + sum);

        //Average the salary of employees.
        double avg = empList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Average: " + avg);

        //Summarize the salary of employees.
        IntSummaryStatistics summary = empList.stream().collect(Collectors.summarizingInt(Employee::getSalary));
        System.out.println("Summary: " + summary);



    }



}
