package techmahindra.tricky;


import java.io.IOException;

class A3
{
    void m1() throws IOException
    {
        System.out.println("In m1 A");
    }
}
class B3 extends A3
{
    //As IOException and Exception are checked exception, so you can not broaden the scope of Exception while
    // method overriding.
    void m1() //throws Exception
    {
        System.out.println("In m1 B");
    }
}

public class GuessOutput03 {
    public static void main(String[] args) {
        A3 a=new B3();
        try {
            a.m1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
