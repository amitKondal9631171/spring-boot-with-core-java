package capgemini.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Operations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("X", "Y", "Z"));

        ListIterator<String> it = list.listIterator(list.size());
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
