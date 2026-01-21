package capgemini.collections;

import java.util.*;

public class MapCollection {

    public static void main(String[] args) {

        //Does not maintain insertion order or sorting
        System.out.println("=======Hash Set does not maintain order==========");
        Map<Integer, Integer> input = new HashMap<>();
        input.put(445,1);
        input.put(59,1);
        input.put(29,1);
        input.put(3,1);
        System.out.println(input);

        System.out.println("=======Linked Hash Set maintains insertion order==========");
        input = new LinkedHashMap<>();
        input.put(445,1);
        input.put(59,1);
        input.put(29,1);
        input.put(3,1);

        System.out.println(input);



        System.out.println("=======Tree Set maintains natural order==========");
        TreeMap<Integer, Integer> input1 = new TreeMap<>(Comparator.reverseOrder());
        input1.put(445,1);
        input1.put(59,1);
        input1.put(29,1);
        input1.put(3,1);
        System.out.println(input1);

    }
}
