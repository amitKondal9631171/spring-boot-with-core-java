package capgemini.programs.streams;

import java.util.Arrays;
import java.util.List;

public class ForEachAndForEachOrder {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 19, 20, 1, 2,10, 19, 20, 1, 2);
        //forEachOrdered will processes the elements of the stream in the order specified by its source
        //, regardless of whether the stream is sequential or parallel.
        list.stream().forEachOrdered(System.out::println);
        System.out.println("---------");
        list.stream().forEach(System.out::println);
    }
}
