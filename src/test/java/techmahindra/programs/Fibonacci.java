package techmahindra.programs;


/**
 * Fibonacci is an example of dynamic programing.
 */
public class Fibonacci {

    public static void main(String[] args) {
        int num, a = 0,b=1, c;
        num = 10;
        System.out.print("Fibonacci Series of the number is:" + a + " " + b + " ");
        for (int i=1; i<=num; i++) {
            c = a+b;
            a = b;
            b = c;

            System.out.print(c + " ");
        }
    }
}
