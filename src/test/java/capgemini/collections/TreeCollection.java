package capgemini.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeCollection {

    public static void main(String[] args) {

        //TreeSet uses natural sorting by default
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Zeno");
        treeSet.add("Kondal");
        treeSet.add("Amit");
        treeSet.add("Sema");
        System.out.println(treeSet);

    }

}
