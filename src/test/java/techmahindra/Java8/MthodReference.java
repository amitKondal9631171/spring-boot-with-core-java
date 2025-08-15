package techmahindra.Java8;

/**
 * Method reference is an important feature related to lambda expressions,
 * which can let you reuse existing method definitions and pass them just like lambda expressions.
 * functional interface can have as much as static method and those methods can be used as the method reference.
 */

interface Sayable{
    void say(int a, int b);
}

public class MthodReference {

    public static void addition(int a, int b){
        System.out.println("Additions: "+ (a+b));
    }
    public void subtraction(int a, int b){
        System.out.println("Subtraction: "+ (a-b));
    }
    public void methodForThread(){
        System.out.println("Thread Implementation");
    }

    public static void main(String[] args) {
        MthodReference obj = new MthodReference();
        // Referring static method
        Sayable sayable = MthodReference::addition;
        // Calling interface method
        sayable.say(2,3);

        sayable = obj::subtraction;
        // Calling interface method
        sayable.say(12,3);

        //thread is pointing to the method
        Thread t1 = new Thread(new MthodReference()::methodForThread);
        t1.start();
    }
}
