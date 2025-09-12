package capgemini.java8.terminal;

import capgemini.entities.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReductionOperation {
    static List<Employee> empList = Arrays.asList(
            new Employee(2, "Rohit", "IT", 2000),
            new Employee(1, "Amit", "IT", 5000),
            new Employee(3, "Sita", "HR", 3000)
    );

    public static void main(String[] args) {

        BinaryOperator<Employee> maxBy = (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2;

        //reduce is a way to take a stream of elements and combine them step by step into a single result, using an operation you define.
        empList.stream().reduce( maxBy ).ifPresent(System.out::println); // Max salary employee reduce = squish many elements → one.

        //Min salary employee
        BinaryOperator<Employee> minBy = (e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2;
        empList.stream().reduce( minBy ).ifPresent(System.out::println); // Min salary employee

        Employee maxSalaryEmp = empList.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .get();
        System.out.println(maxSalaryEmp.getSalary());
    }
}
