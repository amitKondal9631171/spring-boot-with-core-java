package techmahindra.exceptionHandling;

/*

Note: The finally block will not be executed if program exits(either by calling System.exit()
		or by causing a fatal error that causes the process to abort).
 */
public class MultipleCatchBlock {

    //Multiple catch block must be coded in increasing order other wise it will give comple time error
    //that exception already caught....
    public static void main(String[] args) {

        try{
            int a[]=new int[5];
            a[5]=30/0;
        }catch(NullPointerException e)
        {
            System.out.println("NullPointerException .... ");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
