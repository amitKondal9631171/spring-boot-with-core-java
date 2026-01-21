package capgemini.programs.logics;

public class PrintFibonacci {

    //example of Dynamic programming because results is used in next step
    static int printFibonacciSeries(int userInput){

        int a=0, b=1, c;

        if (userInput == 0 || userInput == 1)
            return userInput == 0 ? 0 : 1;


        for(int i = 2; i<=userInput; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(" "+b);
         }
        System.out.println();
        return b;
    }

    //F(N) = F(N-1) + F(N-2)
    private static int fibonacciRecursive(int value){

        if(value <= 1){
            return  1;
        }

        return fibonacciRecursive(value -1) + fibonacciRecursive(value - 2);
    }

    public static void main(String[] args) {

    /**
        System.out.println("0 Fibonacci: " + printFibonacciSeries(0));
        System.out.println("1 Fibonacci: " + printFibonacciSeries(1));
        System.out.println("2 Fibonacci: " + printFibonacciSeries(2));
        System.out.println("8 Fibonacci: " + printFibonacciSeries(8));
    */

        int value = 5;
        //0,1,2,3,4
        for(int i = 0; i < value; i++){
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }
}
