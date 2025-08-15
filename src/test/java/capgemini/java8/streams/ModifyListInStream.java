package capgemini.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModifyListInStream {

    public static void main(String[] args) {

        List<String> lines = new ArrayList <>(Arrays.asList("a", "b", "c"));
        lines.stream().filter(u -> u.equals("a")).forEach(lines::remove);
        System.out.println(lines);
    }

}
