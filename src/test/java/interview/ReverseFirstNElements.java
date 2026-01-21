package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseFirstNElements {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        int k =5;

        List<Integer> result =
                IntStream.range(0, list.size())
                        .mapToObj(i ->
                                i < k
                                        ? list.get(k - 1 - i)
                                        : list.get(i)
                        )
                        .toList();

        System.out.println(result);


    }
}
