package interview;

import capgemini.entities.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeFrequencyAndSort {

    public static void main(String[] args) {

        List<Employee> empList = Arrays.asList(
                new Employee(1, "Amit", "IT", 2000),
                new Employee(2, "Amit", "IT", 1000),
                new Employee(3, "Varun", "HR", 3000),
                new Employee(4, "Varun", "Finance", 2000),
                new Employee(5, "Vikas", "Clark", 1000),
                new Employee(6, "Vikas", "Finance", 3000),
                new Employee(7, "Pawan", "HR", 5000),
                new Employee(9, "Seema", "Clark", 3000),
                new Employee(9, "Pawan", "Engineering", 3000)
        );

        Map<String, List<Employee>> result =

                empList.stream()
                        .collect(Collectors.groupingBy(

                                Employee::getDepartment,

                                //Order by list objects in reverse order based on salary
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                                .collect(Collectors.toList())
                                )

                        ));


        result.forEach((department, employeeList) -> {

                   String joinedNames =
                           employeeList.stream()
                                   .map(Employee::getFirstName)
                                   .collect(Collectors.joining(", "));
                   System.out.println("Department is: " + department + " \n Employees are : " + joinedNames);
               }
               );

    }
}
