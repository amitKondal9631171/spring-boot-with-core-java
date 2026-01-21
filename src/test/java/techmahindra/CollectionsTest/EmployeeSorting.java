package techmahindra.CollectionsTest;

import java.util.Arrays;

public class EmployeeSorting implements Comparable<EmployeeSorting>{

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public EmployeeSorting(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    //this is overridden to print the user-friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }

    public static void main(String[] args) {
        //sorting object array
        EmployeeSorting[] empArr = new EmployeeSorting[4];
        empArr[0] = new EmployeeSorting(10, "Mikey", 25, 10000);
        empArr[1] = new EmployeeSorting(20, "Arun", 29, 20000);
        empArr[2] = new EmployeeSorting(5, "Lisa", 35, 5000);
        empArr[3] = new EmployeeSorting(1, "Pankaj", 32, 50000);

        //sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        System.out.println("Default Sorting of Employees list:\n"+Arrays.toString(empArr));
    }

    /**
     * positive integer, if the current object is greater than the specified object
     * negative integer, if the current object is less than the specified object.
     * zero, if the current object is equal to the specified object.
     * @param o
     * @return
     */
    @Override
    public int compareTo(EmployeeSorting o) {
        return this.getAge() - o.getAge() > 0 ? 1 : (this.getAge() == o.getAge()) ? 0 : -1;
    }
}
