package techmahindra.sortAlgorithms;

import java.util.Comparator;

//Used to compare the objects.
public class CustomSort implements Comparable<CustomSort> {
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

    public CustomSort(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }

    @Override
    public int compareTo(CustomSort emp) {
        //let's sort the employee based on an id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
        return (this.id - emp.id);
    }

    /**
     * Comparator to sort employees list or array in order of Salary
     */
    public static Comparator<CustomSort> SalaryComparator = (e1, e2) -> {
        return (int) (e1.getSalary() - e2.getSalary());
    };


    /**
     * Comparator to sort employees list or array in order of Age
     */
    public static Comparator<CustomSort> AgeComparator = new Comparator<CustomSort>() {

        @Override
        public int compare(CustomSort e1, CustomSort e2) {
            return e1.getAge() - e2.getAge();
        }
    };

    public static Comparator<CustomSort> NameComparator = new Comparator<CustomSort>() {

        @Override
        public int compare(CustomSort e1, CustomSort e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
}