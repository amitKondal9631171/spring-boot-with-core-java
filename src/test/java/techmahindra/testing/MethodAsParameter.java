package techmahindra.testing;


import java.util.function.Function;

public class MethodAsParameter {

    private static String method1(String argument) {
        System.out.println(argument);
        return argument;
    }

    private static void method3(MethodAsParameter s, Function<MethodAsParameter, String> f) {
        String reply = f.apply(s);
        System.out.println("Return from functional interface: " + reply);
    }

    public static void main(String[] args) {

        Function<MethodAsParameter, String> methodReference = (c) -> c.method1("call function");


        method3(
                new MethodAsParameter(), methodReference
        );

    }

}
