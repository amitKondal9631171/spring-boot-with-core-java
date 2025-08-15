package techmahindra.Java8;

/**
 * Lambda expression facilitates functional programming, and simplifies the development a lot.
 */
interface MathOperation {
    int operation(int a, int b);
}

public class JavaLambdaExpression {


    private void functionWithFunctionAsParameter(int a, int b, MathOperation mathOperation) {
        int result = mathOperation.operation(a, b);
        System.out.println("Result according to the Operation Provided to the function: "+result);
    }


    public static void main(String args[]) {

        JavaLambdaExpression testLambda = new JavaLambdaExpression();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        /**Passing addition lambda expression */
        testLambda.functionWithFunctionAsParameter(2,3,addition);

        /**Passing subtraction lambda expression */
        testLambda.functionWithFunctionAsParameter(2,3,subtraction);

        /**Passing multiplication lambda expression */
        testLambda.functionWithFunctionAsParameter(2,3,multiplication);

        /**Passing division lambda expression */
        testLambda.functionWithFunctionAsParameter(2,3,division);

    }


}
