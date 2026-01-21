package techmahindra.Java8;

import java.util.Optional;

public class JavaOptional {

    void callUsingOptionalIfPresent(){
        System.out.println("Called with Not Null Object");
    }

    String callUsingOptionalIfNotPresent(){
        return "Called with Null object";
    }

    public static void main(String args[]) {

        JavaOptional java8Tester = new JavaOptional();
        Optional<JavaOptional> optionalTest =  Optional.ofNullable(java8Tester);
        optionalTest.ifPresent((java8Tester1)->{
            java8Tester1.callUsingOptionalIfPresent();
        });

        String elseValue = optionalTest.orElse(java8Tester).callUsingOptionalIfNotPresent();
        System.out.println(elseValue);
    }


}

