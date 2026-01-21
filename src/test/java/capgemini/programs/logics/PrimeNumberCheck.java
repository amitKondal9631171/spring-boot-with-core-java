package capgemini.programs.logics;


import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        Scanner inputScan = new Scanner(System.in);
        //next will take every input as string
        System.out.println("Input numeric value: ");
        int inputValue = inputScan.nextInt();

        //0, 1 both are not prime numbers
        if(inputValue == 0 || inputValue == 1 ){
            System.out.println("number is not prime");
           return;
        }

        //2, 3 both are not prime numbers
        if(inputValue == 2 || inputValue == 3 ){
            System.out.println("number is prime");
            return;
        }

        boolean isPrime = true;
        for(int i=2; i <= inputValue/2 ; i++){

            if (inputValue % i == 0) {
                isPrime = false;
                break;
            }

        }
        System.out.println("number is prime ? : "+ isPrime);
    }
}
