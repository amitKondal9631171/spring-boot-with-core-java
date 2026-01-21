package techmahindra.innerAndNestedClasses;


public class TestMemberOuter {
    private int data=30;
    static String outerClassMemberVariable = "outer class property";

    class InnerClass{
        /*  Inner classes does not have a static declaration
          *  static String innerClassMemberVariable = "outer class property";
         */
        String innerClassMemberVariable = "inner class property";
        void msg(){
            //Accessing member variable of outer class...
            System.out.println(outerClassMemberVariable+ ": data is :"+data);
        }

    }

    public static void main(String args[]){
        TestMemberOuter obj=new TestMemberOuter();
        //**If you want to instantiate inner class, you must have to create the instance of outer class.
        //In such case, instance of inner class is created inside the instance of outer class.
        InnerClass in = obj.new InnerClass();

        in.msg();

    }
}
