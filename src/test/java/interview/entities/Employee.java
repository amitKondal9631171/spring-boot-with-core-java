package interview.entities;

public class Employee {

    private Integer empId;
    private String firstName;
    private String department;
    private Integer salary;


    public Employee(int i, String rohit, String it, int i1) {
        this.empId=i;
        this.firstName=rohit;
        this.department=it;
        this.salary=i1;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
