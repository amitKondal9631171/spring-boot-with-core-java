package capgemini.java8;



@FunctionalInterface
public interface FunctionalOperation {

    void execute(int a, int b);

    //can have static method just to make use of utility functions.
    // relates to the functional interface itself.
    //Can not be override
    static void staticMethod(){

    }

    //Client contracts will not fail. Otherwise clients need to override the method
    //can be override
    default void defaultMethod(){

    }
}
