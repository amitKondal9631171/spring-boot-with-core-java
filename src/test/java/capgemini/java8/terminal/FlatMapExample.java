package capgemini.java8.terminal;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class EmployeeEg {
    String name;
    List<String> phoneNumbers;
}

/**
 * map = “transform each element into something else”
 * flatMap = “transform each element into a stream, and then flatten the results into one stream”
 */
public class FlatMapExample {

    static List<EmployeeEg> employees = Arrays.asList(
            new EmployeeEg("Amit", Arrays.asList("111", "222")),
            new EmployeeEg("Rohit", Arrays.asList("333", "444"))
    );

    public static void main(String[] args) {

        List<String> allPhones = employees.stream()
                .flatMap(emp -> emp.getPhoneNumbers().stream())
                .collect(Collectors.toList());

        System.out.println(allPhones); // [111, 222, 333, 444]

    }
}
