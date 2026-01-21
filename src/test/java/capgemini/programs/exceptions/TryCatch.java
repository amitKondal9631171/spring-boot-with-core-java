package capgemini.programs.exceptions;

// https://beginnersbook.com/2013/05/flow-in-try-catch-finally/
public class TryCatch {


    static void whenExceptionIsNotHandled(){
        /**
         * When it comes to exceptions, there is a difference in try-catch-finally block
         *  and try-with-resources block. If an exception is thrown in both try block and finally
         *  block, the method returns the exception thrown in finally block.
         *
         */
        try{
            System.out.println("whenExceptionIsNotHandled: num1/num2: "+ 10/0 );
        }catch (RuntimeException exception){
            System.out.println("whenExceptionIsNotHandled: exception");
        }finally {
            System.out.println("whenExceptionIsNotHandled: Finally" + 10/0);
        }

        System.out.println("whenExceptionIsNotHandled: Outside the try catch block");
    }
    //System.exit will stop the application like shutdown
    static void willFinallyExecuteAfterSystemExit(){

        try{
            System.exit(500);
        }catch (RuntimeException exception){
            System.out.println("willFinallyExecuteAfterSystemExit: exception");
        }finally {
            System.out.println("willFinallyExecuteAfterSystemExit: Finally");
        }
    }

    static int willFinallyExecuteAfterReturnFromTry(){

        try{
            return 1;
        }catch (RuntimeException exception){
            System.out.println("willFinallyExecuteAfterSystemExit: exception");
        }finally {
            System.out.println("willFinallyExecuteAfterSystemExit: Finally");
        }
        return 0;
    }

    static int willFinallyExecuteAfterReturnFromCatch(){

        try{
            return 1/0;
        }catch (RuntimeException exception){
            System.out.println("willFinallyExecuteAfterSystemExit: exception");
            return 0;
        }finally {
            System.out.println("willFinallyExecuteAfterSystemExit: Finally");
        }

        //return 0;
    }

    public static void main(String[] args) {
        //willFinallyExecuteAfterReturnFromTry();

        //willFinallyExecuteAfterReturnFromCatch();

        whenExceptionIsNotHandled();

        System.out.println("Aa hash code: " +  "Aa".hashCode());
        System.out.println("BB hash code: " + "BB".hashCode());
        //Keep the execution in the last
        willFinallyExecuteAfterSystemExit();
    }
}
