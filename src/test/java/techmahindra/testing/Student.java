package techmahindra.testing;

import lombok.Data;

/**
 * Class has:
 *  1) Constructor: which has name always same as class name. same as functions but without return type.
 *  2) Data members: eg: name, rollNo, address
 *  3) Functions: who has some functionality. always has return type
 *  */
@Data
public class Student {

    //Variables naming convention is same as the funtions name
    String name;
    int rollNo;
    String address;
    String adminKey;

    public Student(){
        name = "Constructor Name";
        rollNo = 123;
        address = "India";
    }

    String getStudentName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    String getAddress() {
        return address;
    }

    public static void main(String x[]) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        Student obj3 = new Student();
        obj3.name = "Nitika koundal";
        obj3.rollNo = 1;
        obj3.address = "V p o Samela";
        System.out.println("Object one values-----------");
        System.out.println(obj1.getStudentName());
        System.out.println(obj1.getRollNo());
        Runnable getRollNo = obj1::getRollNo;

        System.out.println(obj1.getAddress());
        System.out.println("Object two values-----------");
        System.out.println(obj2.getStudentName());
        System.out.println(obj2.getRollNo());
        System.out.println(obj2.getAddress());
        System.out.println("Object three values-----------");
        System.out.println(obj3.getStudentName());
        System.out.println(obj3.getRollNo());
        System.out.println(obj3.getAddress());

    }
}
