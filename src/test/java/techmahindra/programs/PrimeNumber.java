package techmahindra.programs;


import java.util.Scanner;

 //Prime number: divisible by 1 and itself.
/**
 * A utility class for prime number operations.
 */
public class PrimeNumber {

    /**
     * Checks if a number is prime.
     *
     * @param number The number to check
     * @return true if the number is prime, false otherwise
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        //4,6,8,10,12,14,16
        if (number % 2 == 0) { // validate even numbers
            return false;
        }

        //3,9,15,21,27,33,39 --> didn't understand
        for (int i = 3; i * i <= number; i += 2) { // validate odd numbers
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Prints whether a number is prime or not.
     *
     * @param number The number to check and print
     */
    public static void printPrimeStatus(int number) {
        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        printPrimeStatus(number);

        // Example with an array of numbers
        int[] numbers = {3, 60, 35, 2, 45, 320, 5, 1, 0, 11, 13, 4, 17};
        System.out.println("\nChecking prime status for array elements:");

        for (int n : numbers) {
            printPrimeStatus(n);
        }

        scanner.close();
    }
}
