package capgemini.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@Data
@AllArgsConstructor
public class Employee {

    private Integer empId;
    private  String firstName;
    private String department;
    private  Integer salary;


}
