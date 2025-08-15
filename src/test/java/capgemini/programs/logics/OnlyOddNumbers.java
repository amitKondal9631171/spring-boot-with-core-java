package capgemini.programs.logics;

import java.util.List;

public class OnlyOddNumbers {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = List.of(1, 3, 5, 21, 33, 23);

        //anyMatch breaks the conditions if it finds single element to match the condition
        boolean result = listOfIntegers.stream().anyMatch(number -> number % 2 == 0);

        if(result)
            System.out.println("List contains even numbers");
        else
            System.out.println("List contains odd numbers only");

    }

}
