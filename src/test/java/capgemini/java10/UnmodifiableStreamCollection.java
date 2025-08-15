package capgemini.java10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnmodifiableStreamCollection {

    public static void main(String[] args) {

        Integer[] inputArray = {2,12,32,43,121,4343,521,1};

        List<Integer> listFromArray = Arrays.stream(inputArray).collect(Collectors.toList());
        //List is modifiable
        listFromArray.add(999);
        System.out.println(listFromArray);

        List<Integer> unmodifiableListFromArray = Arrays.stream(inputArray).collect(Collectors.toUnmodifiableList());
        //java 10 provided functionality to return not modifiable list
        unmodifiableListFromArray.add(999);
        System.out.println(unmodifiableListFromArray);
    }

}
