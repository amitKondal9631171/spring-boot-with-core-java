package capgemini.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MutableAndImmutable {

    public static void manualImmutable() {
        List<String> original = new ArrayList<>(Arrays.asList("A", "B", "C"));
        List<String> unmodifiableList = Collections.unmodifiableList(original);

        System.out.println(unmodifiableList); // [A, B, C]

        // unmodifiableList.add("D"); // ❌ UnsupportedOperationException

        original.add("D"); //   Allowed, original is still mutable
        System.out.println(unmodifiableList); // [A, B, C, D]
    }

    private static void trueImmutable() {
        List<String> immutableList = List.of("A", "B", "C");

        System.out.println(immutableList); // [A, B, C]

        // immutableList.add("D");  // ❌ UnsupportedOperationException
        // immutableList.set(0, "Z"); // ❌ UnsupportedOperationException
    }

    public static void main(String[] args) {
        manualImmutable();
    }
}
