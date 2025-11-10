package capgemini.exam.scb.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfEven {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sumOfSquareOfEvenNumbers = Arrays.stream(arr).filter(v -> v%2 == 0).map(v -> v*v).sum();
        System.out.println(sumOfSquareOfEvenNumbers);


        sumOfSquareOfEvenNumbers = IntStream.of(arr).map(v -> {

            if(v%2==0) {
                return v*v;
            }else {
                return 0;
            }

        }
        )
                .sum();

        System.out.println(sumOfSquareOfEvenNumbers);
    }
}
