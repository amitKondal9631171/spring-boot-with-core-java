package capgemini.collections;

import java.util.ArrayList;
import java.util.List;

public class AddCollections {

    static List addLists(List l1, List l2){

        l1.addAll(l2);

        return l1;
    }

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        List<String> l2 = new ArrayList<>();
        l2.add("Amit");
        addLists(l1,l2); // [1, Amit] different kind of list can be added but gives problem while iteration

        System.out.println(l1);
    }
}
