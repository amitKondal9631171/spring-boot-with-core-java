package capgemini.java8;


@FunctionalInterface
public interface WhyOnlyOneFunction {

    /**
     * Lambda can have implementation without method name and
     * If FI could have multiple methods then which method to call during runtime
     * will not be known to the JDK. Because in Lambda expression method name
     * is not defined and parameters are same for both methods.
     */
    //int sum(int a, int b);
    int multiply(int a, int b);

}
