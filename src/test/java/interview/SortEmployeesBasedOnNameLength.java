package interview;

import capgemini.entities.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeesBasedOnNameLength {

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

        Comparator<Employee> customComp = Comparator.comparingInt( (Employee emp)  -> emp.getFirstName().length());


        List<Employee> response = empList.stream().sorted(customComp).toList();

        response.forEach(employee -> System.out.println("Emp Name: " + employee.getFirstName() + " , Name length: "+ employee.getFirstName().length()));
    }
}
