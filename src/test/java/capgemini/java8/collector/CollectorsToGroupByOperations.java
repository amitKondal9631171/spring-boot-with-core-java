package capgemini.java8.collector;

import capgemini.entities.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsToGroupByOperations {
    static List<Employee> empList = Arrays.asList(
            new Employee(1, "Amit", "IT", 1000),
            new Employee(2, "Rohit", "IT", 2000),
            new Employee(3, "Sita", "HR", 3000)
    );


    public static void main(String[] args) {
        Map<String, List<Employee>> listOfEmployee = empList.stream()
                .collect(

                        //Group employees by department and return list of employees in each department.
                        Collectors.groupingBy(

                                Employee::getDepartment

                        )
                );
        System.out.println(listOfEmployee);

        //Group employees and map to their names only.
        Map<String, List<String>> namesByDept = empList.stream()
                .collect(

                        Collectors.groupingBy(

                                Employee::getDepartment, //Group employees by department.
                                Collectors.mapping(Employee::getFirstName, Collectors.toList()) //Map to their names only.

                        )
                );

        System.out.println("Group by names: " + namesByDept);

        Map<String, Integer> salaryByDept = empList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment, //Group employees by department.
                                Collectors.summingInt(Employee::getSalary) //Sum up the salary.
                        )
                );
        System.out.println("group by salary: " + salaryByDept);

        Map<String, Double> avgDepSalary = empList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment, //Group employees by department.
                                Collectors.averagingDouble(Employee::getSalary) //Average the salary.
                        )
                );
        System.out.println("avg salary by dept: " + avgDepSalary);

        Map<String, Long> countByDept = empList.stream()
                .collect(
                        Collectors.groupingBy(
                                Employee::getDepartment, //Group employees by department.
                                Collectors.counting() //Count the number of employees.
                        )
                );
        System.out.println("count by dept: " + countByDept);

        Map<Boolean, List<Employee>> partitionMap = empList.stream()
                .collect(
                        Collectors.partitioningBy(
                                employee -> employee.getSalary() > 1000 //Partition employees based on salary.
                        )
                );
        System.out.println("Partition by salary greater than 1000: " + partitionMap.get(true));
        System.out.println("Partition by salary less than 1000: " + partitionMap.get(false));

    }
}
