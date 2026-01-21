package capgemini.programs.arrayz;

import java.util.Arrays;

public class ArrayStream {

    public static void main(String[] args) {

        Integer[] inputArray = {32,12,43,6,432,32,5342,52,32,53,286,47,673,43,5664};

        inputArray = Arrays.stream(inputArray).filter(value -> value >= 50 && value <= 2000).toArray(Integer[]::new);
        System.out.println(Arrays.toString(inputArray));

        String[] stringArray = {"Amit", "Kondal", "seema", "Devi", "Vikas"};

        stringArray = Arrays.stream(stringArray).filter(element -> element.length()>=6).toArray(String[]::new);

        System.out.println(Arrays.toString(stringArray));

    }

}
