package techmahindra.testing;


// We have classes and methods inside the classes.
//methods has set or instructions or statements or line of code.
//we call methods always...


import java.util.ArrayList;
import java.util.List;

interface  sayable{
    void test();
}

public class Casting{


    public static void showList(List<Integer>list){
        if(!list.isEmpty()){
            System.out.println("list is not empty");
            //
            list.forEach(System.out::println);
        }else System.out.println("list is empty");
    }
    public static void main(String[] args) {

         String str = null;
        System.out.println(str.hashCode());
        // An old approach(prior to Java 7) to create a list
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(11);
        showList(list1);
        // Java 7
        List<Integer> list2 = new ArrayList<>(); // You can left it blank, compiler can infer type
        list2.add(12);
        showList(list2);
        // Compiler infers type of ArrayList, in Java 8
        showList(new ArrayList<>());
    }

    public void test(){
        System.out.println("Inside implemened test method...." + Thread.currentThread().getName());
    }

    static void saySomething(){
        System.out.println("Going to say something...." + Thread.currentThread().getName());
    }
    /*  public static void main( String []args){

        sayable obj = Casting::saySomething;

        Optional<sayable> checkNull = Optional.ofNullable(obj);
        if(checkNull.isPresent()){  // check for value is present or not
            obj.test();
        }else
            System.out.println("string value is not present");

        obj.test();
        //System.out.println(result1);


        List<String> list=new ArrayList<>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach( (n)-> {
                    System.out.println(1);
                    System.out.println(2);
                    System.out.println(3);
                    System.out.println(n);
        }
        );


    }
*/

}
