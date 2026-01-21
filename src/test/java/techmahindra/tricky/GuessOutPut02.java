package techmahindra.tricky;


class A1
{
    void m1() throws IndexOutOfBoundsException
    {
        System.out.println("In m1 A");
    }
}
class B1 extends A1
{
    void m1() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("In m1 B");
    }
}

public class GuessOutPut02 {
    public static void main(String[] args) {
        A1 a=new B1();
        //This will work fine as ArrayIndexOutOfBoundsException and IndexOutOfBoundsException are Runtime exceptions
        // and there is no rule for runtime exceptions while method overriding.
        a.m1();
    }
}
