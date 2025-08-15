package capgemini.java8.streams;

import java.util.Arrays;
import java.util.function.Function;

public class MapVsFunction {

    public static void main(String[] args) {

        Integer[] inputArray = {3,93,32,23,55,34,675,753,32};

        /**
         * Function has apply function which returns value
         */
        Function<Integer[], Integer> streamFunction = (input) -> input[0];

        System.out.println( streamFunction.apply(inputArray) );



    }

}
