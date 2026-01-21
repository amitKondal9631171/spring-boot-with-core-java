package techmahindra.Java8;

/**
 * Created by user on 8/9/2020.
 */
public class DefaultMethodsInInterfaces implements FirstChildInterface, SecondChildInterface {

    public static void main(String[] args) {

        FirstChildInterface  firstChildInterface = new DefaultMethodsInInterfaces();
        firstChildInterface.defaultParentMethodOfInterface();
    }

    @Override public void parentInterfaceMethod(){

    }

    @Override //resolved diamond issue by overriding method.
    public void defaultParentMethodOfInterface() {
        FirstChildInterface.super.defaultParentMethodOfInterface();
        SecondChildInterface.super.defaultParentMethodOfInterface();
    }
}

interface parentInterface{

    String interfaceName = null;
    public abstract void parentInterfaceMethod();

    static void staticMethodInParentInterface(){
        System.out.println("Inside static method of parent interface");
    }

    default void defaultParentMethodOfInterface(){
        System.out.println("Inside default method of parent interface");
    }

}

interface FirstChildInterface extends parentInterface{
    public abstract void parentInterfaceMethod();
    default void defaultParentMethodOfInterface(){
        System.out.println("Inside default method of first child interface");
    }
}

interface SecondChildInterface extends parentInterface{
    public abstract void parentInterfaceMethod();
    default void defaultParentMethodOfInterface(){
        System.out.println("Inside default method of parent interface");
    }
}