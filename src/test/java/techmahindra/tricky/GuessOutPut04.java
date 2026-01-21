

package techmahindra.tricky;



public class GuessOutPut04 extends Thread{

    synchronized void m1()
    {
        System.out.println("In m1 A");
    }
    synchronized void m2()
    {
        System.out.println("In m2 A");
    }
    public void run() {
        System.out.println("Run: "+ getName());
    }

    GuessOutPut04(String name){
        super(name);
    }



}
