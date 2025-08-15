package techmahindra.concepts;


/**
 * Immutable Class:
 * 	1. Define class as final so that it can not be inherited
 * 	2. Define fields private so, that can't be accessed from outside.
 * 	3. Data members in the class must be declared as final so that we can’t change the value of it after object creation.
 * 	4. Don't add setter of the class so, that object initialization can only be taken care by constructor.
 * 	5. If class has any dependency (has-a relationship) then implement the deep copy in the constructor
 */
class Age {
    private int day;
    private int month;
    private int year;
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}

public final class ImmutableClassExample {

    private final int id;
    private final String name;
    private final Age age;
    public String getName() {
        return name;
    }
    public Age getAge() {
        return age;
    }


    public ImmutableClassExample(int id, String name, Age age) {
        this.name = name;
        this.id = id;
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;
    }

    public static void main(String[] args) {

        Age age = new Age();
        age.setDay(1);
        age.setMonth(1);
        age.setYear(1988);
        ImmutableClassExample student = new ImmutableClassExample(1, "Alex", age);
        System.out.println("Alex age year before modification = " + student.getAge().getYear());
        age.setYear(1989);
        System.out.println("Alex age year after modification = " + student.getAge().getYear());

    }
}
