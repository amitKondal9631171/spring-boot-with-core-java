package capgemini.java8.collector;

import capgemini.entities.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MinMax {
    static List<Employee> empList = Arrays.asList(
            new Employee(1, "Amit", "IT", 1000),
            new Employee(2, "Rohit", "IT", 2000),
            new Employee(3, "Sita", "HR", 3000)
    );

    public static void main(String[] args) {

         //Find the minimum salary.
         int minSalary = empList.stream().min(Comparator.comparingInt(Employee::getSalary)).get().getSalary();
         System.out.println(minSalary);

         //Find the maximum salary.
         int maxSalary = empList.stream().max(Comparator.comparingInt(Employee::getSalary)).get().getSalary();
         System.out.println(maxSalary);

         //Find employees with minimum salary.
         List<Employee> minSalaryEmp = empList.stream().filter(e -> e.getSalary() == minSalary).collect(Collectors.toList());
         System.out.println(minSalaryEmp);


         // Single-pass collector
        Collector<Employee, ?, List<Employee>> minSalaryCollector =
                Collector.of(
                        // Supplier: mutable accumulator
                        () -> new ArrayList<Employee>(),
                        // Accumulator: update list based on min salary
                        (list, emp) -> {
                            if (list.isEmpty() || emp.getSalary() < list.get(0).getSalary()) {
                                list.clear();
                                list.add(emp);
                            } else if (emp.getSalary() == list.get(0).getSalary()) {
                                list.add(emp);
                            }
                        },
                        // Combiner: merge two accumulators for parallel streams
                        (list1, list2) -> {
                            if (list1.isEmpty()) return list2;
                            if (list2.isEmpty()) return list1;
                            int min1 = list1.get(0).getSalary();
                            int min2 = list2.get(0).getSalary();
                            if (min1 < min2) return list1;
                            if (min2 < min1) return list2;
                            list1.addAll(list2);
                            return list1;
                        }
                );

        List<Employee> minSalaryEmployees = empList.stream()
                .collect(minSalaryCollector);

        System.out.println(minSalaryEmployees);

    }

}
