package techmahindra.exceptionHandling;

import java.io.IOException;

/**
 * An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to
 * the previous method,If not caught there, the exception again drops down to the previous method, and so on until they
 * are caught or until they reach the very bottom of the call stack.This is called exception propagation.
 *
 * Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated).
 */

class CheckExceptionClass extends RuntimeException{
    String errorMsg;
    CheckExceptionClass(String msg){
        //If we pass msg to super class then we can access the same msg from parent class i.e from Exception class in this case which is
        //parent of RunTimeException class....
        super(msg);
        this.errorMsg = msg;
    }

    public static void checkException() throws IOException {
        throw new IOException("device error");//checked exception
    }

    public static void unCheckException(){
        throw new CheckExceptionClass("excetion custom class");
    }

    public static void parentClassMethodExceptionHirercy() throws IOException{

    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
public class TestExceptionPropagation   {

    void m(){
        try {
            int data = 50 / 0;
        }catch (RuntimeException ex){
            throw new CheckExceptionClass(ex.getMessage());
        }
    }
    //overriden method can not declare checked exception until it is defined in the parent class declaration...
    public static void unCheckException()  throws RuntimeException{

    }
    //can not throw exception bigger than parent declaration.... either equal , sub exception or no exception
    public static void parentClassMethodExceptionHirercy() throws IOException{

    }
    void n() {
       // m();
        unCheckException();
    }
    //In Case of re throw the exception we need use throws keyword
    void p()  {

            n();

            //throw new IOException("Error");

    }
    public static void main(String args[]){
        try {
            TestExceptionPropagation obj = new TestExceptionPropagation();
            obj.m();
            System.out.println("normal flow...");
        }catch (CheckExceptionClass ex){
            System.out.println("Custom class catch block: " + ex.getMessage());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
