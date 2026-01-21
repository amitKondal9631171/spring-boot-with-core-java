package interview;

import java.util.List;

public class ListIsUnique {


    public static void main(String[] args) {

        List<Integer> input = List.of(1,2,3,4,2,3,6,4,3,5,6);
        boolean isUnique = input.stream().distinct().count() == input.size();
        System.out.println("Is unique: " + isUnique);

        input = List.of(1,2,3,4,5,6,7,8,9);
        isUnique = input.stream().distinct().count() == input.size();
        System.out.println("Is unique: " + isUnique);

    }
}
