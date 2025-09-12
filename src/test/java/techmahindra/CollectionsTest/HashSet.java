package techmahindra.CollectionsTest;

import java.util.*;
import java.util.function.IntConsumer;

/**
 *  1) Uses HashMap to store values;
 *  2) Don't have get method to get the element from the set.. we need to use iterator to retrieve the values...
 *  @see Object#hashCode()  // way to give links in the comments....
 *  @see TestObjects
 */

public class HashSet<B> {

    HashMap map = new HashMap();
    int mapCounter = 0;

    private boolean add(B e){
        map.put(mapCounter, e);
        mapCounter++;
        return true;
    }

    private B get(int location){
        B e = (B) map.get(location);
        return e;
    }
    void hashSetOperations(){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add("Ajay");
        al.add(null);
        al.add(null);
        System.out.println("List size: "+al.size());




        // list can have duplicate values as it uses array to store values.
        //Set can't have duplicate values as it is uses hashing technique to store the values...
        // i have passed list object to hashset so it has save unique values into iit..
        java.util.HashSet<String> set = new java.util.HashSet(al);
        set.add(null);
        set.add(null);
        set.add(null);
        System.out.println("Set size: "+set.size());



        // As this statement is iterating the hashset and we have added null value. So, to avoid nullpointer exception
        // we have used null value check..
        set.removeIf(str-> Objects.isNull(str) ? false  : str.contains("Vijay"));

        IntConsumer intConsumer = (int g) -> System.out.println(g);
        intConsumer.accept(3);
        System.out.println("After remove size: "+set.size());

        // by default the iteration is in ascending order
        TreeSet<String> treeSet=new TreeSet<String>();
        treeSet.add("Ravi");
        treeSet.add("Vijay");
        treeSet.add("Ajay");
        System.out.println("Traversing String element through Iterator in descending order");
        Iterator i=treeSet.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        Map map=new HashMap();
        TreeSet<Integer> treeIntSet=new TreeSet<Integer>();

        treeIntSet.add(3);
        treeIntSet.add(1);
        treeIntSet.add(2);
        System.out.println("Traversing integer element through Iterator in descending order");
        i=treeIntSet.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        //Highest and lowest value
        TreeSet<Integer> highLowValue=new TreeSet<Integer>();
        highLowValue.add(24);
        highLowValue.add(66);
        highLowValue.add(12);
        highLowValue.add(15);

        // it is adding the values in ascending order and we are getting first and last value so it will return the lowest at starting
        // and highest as the last.
        System.out.println("Highest Value: "+highLowValue.pollFirst());
        System.out.println("Lowest Value: "+highLowValue.pollLast());
    }

    boolean operatorOverloadTest(){
        return true;
    }
    public static void main(String [] args) {

        HashSet cutomSet = new HashSet();
        cutomSet.add("Amit");
        cutomSet.add(981);

        System.out.println(cutomSet.get(0));
        System.out.println(cutomSet.get(1));



        //One of the best example of functional interface...
        //Comparable Interface
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println("My Runnable");
            }};

        //Lambda expression practise not part of collection learning
        // declaration of interface implementation
        // Lambda expression used for function programing .  A functional interface is an interface that contains only one abstract method.

       // MathOperation addition = (int a, int b) -> a + b;
       // System.out.println(addition.integerOperation(30, 23));
    }
}

//Annotation is used to define the interface as functional interface. if we will create multiple abstraction function in this interface then
//it will give compile time error..
/*
We don’t need to use @FunctionalInterface annotation to mark an interface as Functional Interface.
It is not mandatory to use it, but it’s best practice to use it with functional interfaces to avoid addition of extra methods accidentally.
 */
@FunctionalInterface
interface MathOperation {
    int integerOperation(int a, int b);
    //I m testing lambda expression as a functional interface and it does not allow to have multiple functions..
    //function interface can have single method.. only
    //String stringOperation(String a, String b);

    /**
     * Since functional interfaces have only one method, lambda expressions can easily provide the method implementation.
     * We just need to provide method arguments and business logic. For example, we can write above implementation using lambda expression as:
         Runnable r1 = () -> {
         System.out.println("My Runnable");
     };
     * So lambda expressions are means to create anonymous classes of functional interfaces easily.
     * There are no runtime benefits of using lambda expressions, but it makes code lines less.
     */

    // functional interface can have one default function with the declaration.. as per java 8 feature..
    default boolean java8DefaultFunctionImplementation(int a, int b) {
        return  a > b ;
    }

    static void staticFunction(){
        Object obj = new Object();
    }

}