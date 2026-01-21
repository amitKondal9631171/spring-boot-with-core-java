package basics;


class A {
    static void foo() {
        System.out.println("A");
    }
}

class B extends A {
    static void foo() {
        System.out.println("B");
    }
}

public class Static {

    public static void main(String[] args) {

        A obj = new B();
        obj.foo();  //calls A class method because: Because static method resolution is based on:reference type, not object type

        int a = 78324;


        System.out.println("Number of digits in integer value: "+  String.valueOf(a).toCharArray().length );
    }
}
