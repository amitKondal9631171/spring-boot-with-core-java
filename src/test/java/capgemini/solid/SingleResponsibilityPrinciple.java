package capgemini.solid;

/**
 * The single responsibility principle states that every Java class must perform a single functionality.
 */

class Student{

    int studentRollNumber;
    //Adding employee ID in Student class breaks the Single responsibility principal
    int employeeID;

    public int getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(int studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

}

public class SingleResponsibilityPrinciple {
}
