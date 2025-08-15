package capgemini.programs.logics;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner inputScan = new Scanner(System.in);

        System.out.println("Enter number to check is palindrome or not: ");
        long inputValue = inputScan.nextLong();
        long orgValue = inputValue;
        long reverseValue = 0;
        while ( inputValue > 0){

            long currentValue  = inputValue % 10;
            reverseValue = 10 * reverseValue + currentValue;

            inputValue = inputValue / 10 ;

        }

        System.out.println("Is Number Palindrome ? "+ (orgValue == reverseValue));


        System.out.println("Enter String to check is palindrome or not: ");
        String stringInput = inputScan.next();
        stringInput = stringInput.toLowerCase();
        for (int i = 0; i < stringInput.length() / 2 ; i++){
            if(stringInput.charAt(i) != stringInput.charAt( stringInput.length() - 1 - i)) {
                System.out.println("Not Palindrome");
                break;
            }
        }

    }

}
