package capgemini.programs.logics;

import capgemini.entities.Employee;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setEmpId(1);
        e1.setFirstName("Amit");
        e1.setLastName("Kondal");

        Employee e2 = new Employee();
        e2.setEmpId(2);
        e2.setFirstName("Seema");
        e2.setLastName("Kondal");

        List<Employee> employeeList = List.of(e1, e2);
        Map<Integer, Employee> listToMap = employeeList.stream()
                .collect(
                            //to Map takes Function, Function as input
                            Collectors.toMap(Employee::getEmpId, employee -> employee)
                );
        System.out.println(listToMap);

        Map<Integer, Employee> linkedHashMap =employeeList.stream().collect(Collectors.toMap(
                Employee::getEmpId, element -> element
                ,(v1, v2) -> v1
        , LinkedHashMap::new));

        System.out.println(linkedHashMap);

    }
}
