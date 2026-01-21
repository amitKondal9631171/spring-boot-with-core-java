package techmahindra.innerAndNestedClasses;


abstract class Person{
    abstract void eat();
}
class TestAnonymousInner{
    public static void main(String args[]){
        Person p=new Person(){
            void eat(){System.out.println("nice fruits");}
        };
        p.eat();
    }
}

/*
Decompiled class: new Person() is not object of abstract class it just looks like but internally the abstract class is being extended
by the class which overrides the person class method..
It performs two main tasks behind this code:
1. A class is created but its name is decided by the compiler which implements the Eatable interface and provides the implementation of the eat() method.
2. An object of Anonymous class (TestAnonymousInner$1) is created that is referred by p reference variable of Person type.

final class TestAnonymousInner$1 extends Person
{
  void eat()
  {
    System.out.println("nice fruits");
  }
}
 */