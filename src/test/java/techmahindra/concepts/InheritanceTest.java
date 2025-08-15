package techmahindra.concepts;

class ParentClass {
    private String classType;

    ParentClass() {
        System.out.println("Parent class constructor");
    }

    public String ClassType() {
        return "Parent Class";
    }

}

class SubClassOne extends ParentClass {
    SubClassOne() {
        System.out.println("SubClassOne constructor");
    }

    public String ClassType() {
        return "SubClassOne Class";
    }

}

/**
 * Extending parent class indirectly so it can be casted to parent class
 */
class SubClassTwo extends SubClassOne {

    SubClassTwo() {
        System.out.println("SubClassTwo constructor");
    }

    public String ClassType() {
        return "SubClassTwo Class";
    }

    public String SubClassTwoPersonalMethod() {
        return "SubClassTwoPersonalMethod called";
    }
}

public class InheritanceTest extends ParentClass {

    InheritanceTest() {
        System.out.println("InheritanceTest constructor");
    }

    public static void main(String[] args) {

        /**
         * First parent class object will be created because InheritanceTest is subclass of ParentClass
         */

        InheritanceTest obj = new InheritanceTest();


        ParentClass parentClass = new SubClassOne();
        System.out.println(parentClass.ClassType());

        SubClassTwo subClassTwo = new SubClassTwo();
        System.out.println(subClassTwo.ClassType());

        ParentClass subClassTwoCastedToParentClass = (ParentClass) subClassTwo; //here we just given the reference to parent class which will point to sub class object.

        System.out.println(subClassTwoCastedToParentClass.ClassType());

        String stringConcatinationWithInteger = "Amit" + 1;
        int integerAndInteger = 1 + 1;
        System.out.println(stringConcatinationWithInteger + " : " + integerAndInteger);
    }

    @Override
    public String ClassType() {
        return "Child Class";
    }
}
