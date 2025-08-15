package capgemini.java8;

public class Operations {

    static void multiplicationOfNumbers(int a, int b){
        System.out.println("Multiplication of give numbers "+ ( a * b ));
    }

    public static void main(String[] args) {

        FunctionalOperation additionOperation = (int a, int b) -> {
            System.out.println("Addition of give numbers "+ ( a + b ));
        };

        //directly call the method
        additionOperation.execute(9,9);

        //Passing the lambda expression
        MathematicalOperations mOperation = (int a, int b, FunctionalOperation operation)-> {
            operation.execute(a, b);
        };

        //We can pass method as function parameter
        mOperation.performOperation(5, 6, additionOperation);

        //We can pass executable code as function parameter
        mOperation.performOperation(51, 6, (int a, int b) -> System.out.println("Subtraction of two numbers: " + (a-b)));

        //Passing method as reference
        mOperation.performOperation(5,5, Operations::multiplicationOfNumbers);

    }

}
