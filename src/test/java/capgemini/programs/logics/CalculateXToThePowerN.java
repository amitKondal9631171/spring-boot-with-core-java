package capgemini.programs.logics;


public class CalculateXToThePowerN {


    //The relation is: (x to the power n)  = x * x to the power(n-1)
    static double calculatePower(double x, int n){

        if(n == 0) return 1;

        double xMinusOne =  calculatePower(x, n-1);

       return x * xMinusOne;
    }


    public static void main(String[] args) {

        double x = 2; int n =  3;

        if(n < 0) {
            System.out.println( 1.0 / calculatePower(x,-n) );
        }else {
            System.out.println(calculatePower(x, n));
        }

    }
}
