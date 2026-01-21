package capgemini.programs.logics;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int firstNumber = 20, secondNumber = 10;

        //Total of both numbers
        firstNumber = firstNumber+secondNumber;
        //out of total subtract the first will get the second number
        secondNumber = firstNumber-secondNumber;
        //Now as second number got replaced with first then subtract the second number(replace) with the total no
        firstNumber  = firstNumber-secondNumber;


        System.out.println(firstNumber);
        System.out.println(secondNumber);
    }
}
