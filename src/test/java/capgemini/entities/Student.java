package capgemini.entities;

import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class Student implements Comparable<Student>{

    int rollNumber;
    String name;

    public Student(int rollNumber, String name){
        this.rollNumber=rollNumber;
        this.name=name;
    }

    @Override
    public int compareTo(Student o) {
        //decreasing Oder
        return Integer.compare(o.getRollNumber(), this.getRollNumber());
    }

}
