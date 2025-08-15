package capgemini.generics;

import java.util.List;

public class SumOfOddAndEvenNumbers {

    //upper bound
    public static <I extends Number> void sumOfOddAndEvenNumbers(List<I> numbers){

        double evenSum = 0;
        double oddSum = 0;

        for (I number: numbers) {
            if (number.doubleValue() % 2 == 0) {
                evenSum += number.doubleValue();
            } else {
                oddSum += number.doubleValue();
            }
        }
        System.out.println("Original list of numbers: " + numbers);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

    }

    public static void process(List<? extends Student> list) {
        for (Student elem : list) {

        }
    }
    public static void main(String[] args) {


        sumOfOddAndEvenNumbers(List.of());
    }

}
