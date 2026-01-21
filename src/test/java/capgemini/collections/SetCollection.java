package capgemini.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

    public static void main(String[] args) {

        //Does not maintain insertion order or sorting
        System.out.println("=======Hash Set does not maintain order==========");
        Set<Integer> input = new HashSet<>();
        input.add(445);
        input.add(59);
        input.add(29);
        input.add(3);
        System.out.println(input);

        System.out.println("=======Tree Set maintains natural order==========");
        input = new TreeSet<>();
        input.add(445);
        input.add(59);
        input.add(29);
        input.add(3);

        System.out.println(input);

        System.out.println("=======Linked Hash Set maintains insertion order==========");
        input = new LinkedHashSet<>();
        input.add(445);
        input.add(59);
        input.add(29);
        input.add(3);

        System.out.println(input);

    }
}
