package capgemini.programs.logics;

public class CountDigitsInNumber {

    public static void main(String[] args) {
        int numberIs = 9876546;

        int res = 0;
        while(numberIs != 0) {
            // / Divides one value by another
            numberIs = numberIs/10;
            res++;
        }
        System.out.println("Digits present in a number: "+ res);


        //Check how many times digit present in a number
        numberIs = 9876546;
        res = 0;
        while(numberIs != 0) {
            if(numberIs%10 == 6)
                res++;

            numberIs = numberIs/10;

        }
        System.out.println("How many times 6 present in a number :"+res);

        //Sum of all digits
        numberIs = 9876546;
        res = 0;
        while(numberIs != 0) {

            res += numberIs%10;

            numberIs = numberIs/10;

        }
        System.out.println("Sum of all the digits in a number: "+res);


    }
}
