package techmahindra.programs;

/**
 * Created by HP-USER on 16-01-2019.
 */


class Animal {

}
abstract class AbstractAnimal {
    AbstractAnimal(){
        System.out.println("Constructor of abstract class is called....");
    }
    //protected not allowed here
   // protected abstract void  protectedMehtod();

    void staticMetodOfAbsTractClass(){
        System.out.println("Inside static method of abstract class....");
    }
}
interface humans{
    //protected not allwoed here,
    //abstract void  protectedMehtod();
    static void staticMetodOfAbsTractClass(){
        System.out.println("Inside static method of abstract class....");
    }

    //by default all functions are public and abstract....
    void bittenByAnimal();
}
class Dog extends Animal implements humans{
    void canBite() {
        System.out.println("Yes, dog can bite");
    }

    @Override
    public void bittenByAnimal() {
        System.out.println("Yes, humans are bitten by Dog");
    }
}
class Cat extends Animal implements humans{
    void canBite() {
        System.out.println("Yes, cat can bite");
    }

    @Override
    public void bittenByAnimal() {
        System.out.println("Yes, humans are bitten by Cat");
    }
}
class Horse extends Animal implements humans{
    void canBite() {
        System.out.println("Yes, horse can bite");
    }

    @Override
    public void bittenByAnimal() {
        System.out.println("Yes, humans are bitten by horse");
    }
}
class Cow extends Animal implements humans{
    void canBite() {
        System.out.println("No, cow can't bite");
    }

    @Override
    public void bittenByAnimal() {
        System.out.println("No, cow never bite humans");
    }
}
class AbstractAnimalImpl extends AbstractAnimal{

}

public class TestProgram extends AbstractAnimal implements humans{

    //In this case we don't know the object being called to isAnimalBite function so we need to check the object type.
    //which increase the dependency to this function...
    //To avoid this we have functionality of Abstract class and interfaces which don't need to know the types...
    static void isAnimalBite(Animal animal){
        if(animal instanceof Dog)
            ((Dog) animal).canBite();
        if(animal instanceof Cat)
            ((Cat) animal).canBite();
        if(animal instanceof Horse)
            ((Horse) animal).canBite();
        if(animal instanceof Cow)
            ((Cow) animal).canBite();
    }

    static void isBittenByAnimal(humans human){
        human.bittenByAnimal();
    }

    public static void main (String [] args) {
        System.out.println("Processing through down casting.............");
        isAnimalBite(new Dog());
        isAnimalBite(new Cat());
        isAnimalBite(new Horse());
        isAnimalBite(new Cow());
        System.out.println("Processing through interfaces.............");
        isBittenByAnimal(new Dog());
        isBittenByAnimal(new Cat());
        isBittenByAnimal(new Horse());
        isBittenByAnimal(new Cow());
        System.out.println("Processing abstract class.............");
        AbstractAnimal abc = new AbstractAnimalImpl();

        //AbstractAnimal.staticMetodOfAbsTractClass();

        TestProgram obj = new TestProgram();

        obj.staticMetodOfAbsTractClass();
    }

    @Override
    public void bittenByAnimal() {

    }
}