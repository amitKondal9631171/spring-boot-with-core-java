package capgemini.java8;

import lombok.Data;

import java.util.Optional;
import java.util.function.Function;

/**
 * What is optional, and what is it best used for?
 *      Optional is a new container class defined in the java.util package,
 *      and used to represent optional values that either exist or do not exist.
 *      Optional’s chief benefit is avoiding null checks, and there are no longer
 *      any “NullPointerException” results at run-time.
 */

@Data
class TestOptional{
    boolean isTrue;
    boolean isFalse;
    String someValue;
}
public class OptionalOperation {

    static void printValues(TestOptional optional){
        System.out.println((", getSomeValue: ").concat(optional.getSomeValue()));
    }

    static void display(int a , double b){

    }
    public static void main(String[] args) {

        TestOptional obj = new TestOptional();


        Optional<String> optionalInteger = Optional.ofNullable(obj.getSomeValue());

        //If want to operate only on present value
        optionalInteger.ifPresent(System.out::println);

        //If want to operate on absence of value
        String elseValue = optionalInteger.orElse("Else value");

        System.out.println(elseValue);
        //If want to operate on both if else
        if(optionalInteger.isPresent()){
            String result = optionalInteger.get();
            System.out.println(result);
        }else{
            System.out.println("add else implementation");
        }

        Runnable runnable = () -> System.out.println("Value not present");
        //Optional way of if else
        optionalInteger.ifPresentOrElse(System.out::println, runnable );

        Function<TestOptional, TestOptional> consumerOperation = (TestOptional optional) -> {
            optional.setFalse(false);
            optional.setTrue(true);
            optional.setSomeValue("Updated in consumer operation");
           return optional;

        } ;

        TestOptional updatedObject = consumerOperation.apply(obj);

        Apply<TestOptional> test = (TestOptional t) -> {
            System.out.println(t.getSomeValue());
        };

        test.apply(updatedObject);

        System.out.println("Welcome".charAt(3));


    }

}
