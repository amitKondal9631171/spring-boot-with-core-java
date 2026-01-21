package capgemini.programs.logics;



public class Factorial {

    static int iterativeFactorial(int number){

        if(number == 0)
            return 1;

        int factorial = 1;
        for(int i = 1; i <= number; i++){

            factorial *= i;

        }

        return factorial;
    }

    static int recursiveFactorial(int a){

        if(a == 1)
            return 1;

        return recursiveFactorial(a-1) * a;
    }

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(5));
        System.out.println(iterativeFactorial(5));
    }

}
