package techmahindra.programs;

/**
 * Created by HP-USER on 19-01-2019.
 */
public class Recursion {
    static int factorial(int n){
        System.out.println("Stack size: "+Thread.currentThread().getStackTrace().length + ", value is: "+ n);
        int output;

        if(n==1){
            System.out.println("return value: " + n);
            return 1;
        }

        System.out.println("Processed **************\n\n");
        output = factorial(n-1) * n;
        System.out.println("calculation purpose how recursion works: "+ output);
        return output;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: "+ factorial(5));


    }
}
