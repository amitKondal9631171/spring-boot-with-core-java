package capgemini.oops;

class Parent {

    //Static is used for method hiding
    public static void classInfo() {

        System.out.println("Parent class method");

    }
}

/*
    Method hiding can be defined as, "if a subclass defines a static method with the same
    signature as a static method in the super class, in such a case, the method in the subclass
    hides the one in the superclass." The mechanism is known as method hiding.
*/
public class MethodHiding extends Parent {

    //Static method can be overloaded but can not be override
    public static void classInfo() {

        System.out.println("Sub class method");

    }

    //static binding is also known as early binding. It depends on the type of reference variable.
    public static void main(String[] args) {


        //Static methods are bonded during compile time using types of reference variables not object.

        Parent parent = new Parent();
        parent.classInfo();

        parent = new MethodHiding();
        parent.classInfo();

        //still calls the parent class method because
        //Static methods are bonded during compile time using types of reference
        //variables not object.

        MethodHiding methodHiding = new MethodHiding();
        methodHiding.classInfo();
    }

}