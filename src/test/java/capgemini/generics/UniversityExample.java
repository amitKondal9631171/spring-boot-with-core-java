package capgemini.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class University {
    String name;
    University(String name) { this.name = name; }
}

class College extends University {
    College(String name) { super(name); }
}

class EngineeringCollege extends College {
    EngineeringCollege(String name) { super(name); }
}


public class UniversityExample {

    public static void addEngineeringColleges(List<? super College> institutions) {
        institutions.add(new College("Arts College"));          // ✅ Allowed
        institutions.add(new EngineeringCollege("Tech Engg"));  // ✅ Allowed

        // ❌ Reading restricted
        Object obj = institutions.get(0); // Only safe as Object
    }

    public static void printColleges(List<? extends College> colleges) {
        for (College c : colleges) { // Safe read
            System.out.println("College Name: " + c.name);
        }
        // ❌ Cannot add
         //colleges.add(new College("New College")); // Compile error
        /**
         * Then you'd have a plain College (not necessarily an EngineeringCollege) in a List<EngineeringCollege>.
         * This breaks the guarantee that the list only holds EngineeringCollege objects, and type safety collapses.
         * “Contains some subtype of College, but we won’t tell you which one.”
         * Because you don’t know which specific subtype is inside, the compiler won’t let you put any arbitrary College in it.
         * But you can safely take out items as College — reading is always safe.
         */
    }

    public static void main(String[] args) {
        List<College> colleges = new ArrayList<>();
        colleges.add(new College("Arts College"));
        colleges.add(new EngineeringCollege("Tech Engineering"));

        printColleges(colleges);


        List<University> universities = new ArrayList<>();
        addEngineeringColleges(universities); // Works with List<University>

    }


}
