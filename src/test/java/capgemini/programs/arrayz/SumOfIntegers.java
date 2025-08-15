package capgemini.programs.arrayz;

import java.util.Arrays;

public class SumOfIntegers {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        int result = 0;
        for (int element : array) {
            result += element;
        }
        System.out.println(result);

        int streamResult = Arrays.stream(array).sum();
        System.out.println(streamResult);

    }

}
