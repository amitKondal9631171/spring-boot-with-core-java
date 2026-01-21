package capgemini.exam.scb.streams;

import java.util.stream.IntStream;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,2,3,8,9,10};

        IntStream.of(arr)
                .distinct()
                .forEach(System.out::println);
    }
}
