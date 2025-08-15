package techmahindra.Java8;

/**
 * Created by vkondal on 8/11/2020.
 */

@FunctionalInterface
public interface FuntionalInterface {

    public abstract void functionInterfaceMethod();


    default void functionalInterfaceDefaultMethod(){
        System.out.println("Java 8 gives the functionality to add default methods in interfaces");
    }

    static void functionalInterfaceStaticMethod(){
        System.out.println("Functional interface can have static method also");
    }

    public static final String interfaceStaticStringVariable="functional interface can have static variables";
    public static final String interfaceNonStaticStringVariable="functional interface non static variables";


    //functional interface can override object class methods..
    @Override
    public int hashCode();

    @Override public boolean equals(Object obj);

    /**
     * can not override clone method...
     * @Override protected native clone() throws CloneNotSupportedException;
     */

}

