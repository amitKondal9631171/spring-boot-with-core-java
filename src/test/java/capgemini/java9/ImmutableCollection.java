package capgemini.java9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ImmutableCollection {
    public static void main(String[] args) {

        //List.of , Set.of are introduced in java 9 for immutable collections.
        List<String> immutableList = List.of("Amit", "Kondal");
        Set<String> immutableSet = Set.of("Amit", "Kondal");

        //Before java9 we externally needs to make collection immutable
        List<Integer> beforeJava9 = new ArrayList<>();
        beforeJava9 = Collections.unmodifiableList(beforeJava9);
    }
}
