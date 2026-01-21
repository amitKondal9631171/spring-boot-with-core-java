package capgemini.programs.logics;
// If it is equal to sum of its digits each raised to the power of number of digits in it.
// For example: 153, 9474, 54748 are some Armstrong numbers.
public class ArmstrongNumber {

    private static int powerOf(int value, int power){

        if(power == 1)
            return value;

        return value * powerOf(value,power-1);

    }

    //Must revise example includes % & / maths operation
    public static void main(String[] args) {

        int isArmStrong = 547483;
        double counter = Math.log10(isArmStrong);
        System.out.println(counter);
        int power = String.valueOf(isArmStrong).length();
        int sumOfDigits = 0, orignalValue = isArmStrong;
        while( isArmStrong > 0 ){
            int value = isArmStrong % 10;
            value = powerOf(value,power);
            sumOfDigits+=value;
            isArmStrong = isArmStrong / 10;
        }
        System.out.println("Is amrstrong ? " + (orignalValue == sumOfDigits) );
    }

}
