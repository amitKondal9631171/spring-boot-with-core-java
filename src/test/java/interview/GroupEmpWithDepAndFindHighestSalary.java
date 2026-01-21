package interview;

import capgemini.entities.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class GroupEmpWithDepAndFindHighestSalary {


    public static void main(String[] args) {


        List<Employee> empList = Arrays.asList(
                new Employee(1, "Rohit", "IT", 2000),
                new Employee(2, "Amit", "IT", 1000),
                new Employee(3, "Sita", "HR", 3000),
                new Employee(4, "Varun", "Finance", 2000),
                new Employee(5, "Tarun", "Clark", 1000),
                new Employee(6, "Vikas", "Finance", 3000),
                new Employee(7, "Arti", "HR", 5000),
                new Employee(9, "Seema", "Clark", 3000),
                new Employee(9, "Pawan", "Engineering", 3000)
        );

       Map<String, Optional<Employee>> filteredRecords = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        filteredRecords.forEach((department, value) -> {

            Employee employee = value.orElse(null);

            System.out.println("Department: " + department + ", Emp Name: " + employee.getFirstName() + ", Salary: " + employee.getSalary());
        });


        System.out.println("Sum of Salary: " + empList.stream().map(Employee::getSalary).mapToInt(v->v).sum() );

    }



}
