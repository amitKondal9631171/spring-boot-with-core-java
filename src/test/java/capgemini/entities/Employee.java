package capgemini.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class Employee extends School {

    Integer empId;
    String firstName;
    String department;
    Integer salary;
}
