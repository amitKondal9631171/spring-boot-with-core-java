package techmahindra.CollectionsTest;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

class University{

}

class College extends University{

}

class School extends College{

}

class Teacher extends School{

}

class Alone{

}
public class UpperAndLowerBound {

    //list will take only element of same type or parent of College type.
    //This list will take list of College entities and its parent entities
    private static void lowerBoundGenerics(List<? super College> lowerBoundList){
        /**
         * In lower case it is perfectly fine as we safe to assume that every subclass can be added to its super class.
         */
        lowerBoundList.add(new College());
        lowerBoundList.add(new School());
        lowerBoundList.add(new Teacher());
        lowerBoundList.forEach( p -> System.out.println(p));
    }

    //This will take List of College entity and its sub classes
    private static void upperBoundGenerics(List<? extends College> upperBoundList){

        /**
         * In upper bound generics the problem is that compiler doesn't know the exact type that is going to be added.
         * upperBoundList.add(new College());
         */

        upperBoundList.forEach( p -> System.out.println(p));
    }

    public static void main(String[] args) {

        List<University> universities = new ArrayList<>();
        universities.add(new University());universities.add(new University());universities.add(new University());

        List<College> colleges = new ArrayList<>();
        colleges.add(new College());colleges.add(new College());colleges.add(new College());

        List<School> schoolList = new ArrayList<>();
        schoolList.add(new School());schoolList.add(new School());schoolList.add(new School());

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher());teachers.add(new Teacher());teachers.add(new Teacher());

        lowerBoundGenerics(universities);
        lowerBoundGenerics(colleges);
        //lowerBoundGenerics(schoolList);
        //lowerBoundGenerics(teachers);

        //upperBoundGenerics(universities);
        upperBoundGenerics(colleges);
        upperBoundGenerics(schoolList);
        upperBoundGenerics(teachers);

        List<Integer> ints = Arrays.asList(1,2,4);
        List<? extends Number> myList = new ArrayList<>();
        myList = ints;

        List<? super Number> l = new ArrayList<>();
        l.add(new Integer(3));  //OK
        l.add(new Double(3.3)); //OK
    }
}
