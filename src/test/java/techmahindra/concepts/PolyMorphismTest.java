package techmahindra.concepts;

class ParentClassForPolyMorphism{

    ParentClassForPolyMorphism(){
        System.out.println("Parent constructor executed");
    }

    public void overloadingMethod(){
        System.out.println("Method to overload");
    }

    /**
     * In Java, it is achieved with the use of method overloading. In method overloading, the method parameters can vary with
     * a number, order, or the types of parameter.
     */
    protected void overloadingMethod(String s){
        System.out.println("Parent class Method is overloaded");
    }

    protected void overridingMethod(String s){
        System.out.println("Parent class Overriding method");
    }

    public void overridingPublicMethod(String s){
        System.out.println("Parent class Overriding method");
    }
}
public class PolyMorphismTest extends ParentClassForPolyMorphism{

    PolyMorphismTest(){
        System.out.println("Child constructor executed");
    }
    /**
     * visibility must be protected or public
     * @param s
     */
    protected void overridingMethod(String s){
        System.out.println("Child class Overriding method");
    }
    /**
     * visibility must public because in inheritance accessibility can not be reduced.
     * @param s
     */
    public void overridingPublicMethod(String s){
        System.out.println(" Child class Overriding method");
    }

    public static void main(String[] args) {

        ParentClassForPolyMorphism parent = new PolyMorphismTest();

        parent.overridingPublicMethod("Overridden method called");
    }

}
