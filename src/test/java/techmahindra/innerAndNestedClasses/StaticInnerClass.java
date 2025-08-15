package techmahindra.innerAndNestedClasses;

/**
 * Created by HP-USER on 22-01-2019.
 */
public class StaticInnerClass {
    static int data=30;

    static class Inner  extends TestMemberOuter{
        int x = 20;

        void msg(){
            System.out.println( x + ": data is "+data);
            System.out.println(TestMemberOuter.outerClassMemberVariable);
        }
    }

    static class StaticTestInterface implements TestInterface{

        @Override
        public void test() {
            System.out.println("Inside test function");
        }

    }
    class NonStaticInner extends TestMemberOuter{
        int x = 20;
        void msg(){
            System.out.println( x + ": data is "+data);
            System.out.println(TestMemberOuter.outerClassMemberVariable);
        }
    }
    public static void main(String args[]){
        Inner obj=new Inner();
        obj.msg();

        StaticTestInterface obj1=new StaticTestInterface();
        obj1.test();
    }
}
