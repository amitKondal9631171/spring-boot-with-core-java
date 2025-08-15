package capgemini.collections.map;

import lombok.Data;
import techmahindra.testing.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MapWithList {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setAdminKey("123");
        student1.setName("Amit");
        student1.setRollNo(1);
        Student student2 = new Student();
        student2.setAdminKey("456");
        student2.setName("Meena");
        student2.setRollNo(1);
        Student student3 = new Student();
        student3.setAdminKey("789");
        student3.setName("Seema");
        student3.setRollNo(1);

        List<Student> list1 = new ArrayList<>();
        Student student4 = new Student();
        student4.setName("Seema");
        student4.setRollNo(10);
        Student student5 = new Student();
        student5.setName("Amit");
        student5.setRollNo(20);
        Student student6 = new Student();
        student6.setName("Meena");
        student6.setRollNo(30);


        List<Student> map = new ArrayList<>();
        map.add(student1);
        map.add(student2);
        map.add(student3);
        list1.add(student4);
        list1.add(student5);
        list1.add(student6);


        List<BalanceDetailsDto> response = map.parallelStream().map(value ->

                list1.stream()
                        .filter(value1 -> value.getName().equalsIgnoreCase(value1.getName()))
                        .findAny()
                        .map(agreement -> {
                                    BalanceDetailsDto object = new BalanceDetailsDto();
                                    object.setAdminKey(value.getAdminKey());
                                    object.setAmount(agreement.getRollNo());
                                    object.setCurrency("USD");
                                    return object;
                                }
                        ).orElse(null)

        ).filter(Objects::isNull).collect(Collectors.toList());

        System.out.println(response);
    }

}

@Data
class BalanceDetailsDto {
    private String adminKey;
    private String currency;
    private double amount;
}