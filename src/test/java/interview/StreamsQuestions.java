package interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsQuestions {

    static void partioningBasedOnLength(List<String> input){

        Map<Boolean, List<String>> partioningValues = input.stream().collect(Collectors.partitioningBy(value -> value.length() == 6));

        List<String> applicableList = partioningValues.get(true);
        System.out.println("list with Values length == 6 :" + applicableList);

        List<String> notApplicableList = partioningValues.get(false);
        System.out.println("list with Values length not = 6 :" + notApplicableList);


    }

    static void mostOccuringWord(List<String> input){

        String mostOccuringValue = input.stream().collect(Collectors.groupingBy(v -> v, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println(mostOccuringValue);

    }


    public static void main(String[] args) {

        List<String> input = new ArrayList<>(); input.add("Apple"); input.add("Banana"); input.add("Apple"); input.add("Apple"); input.add("Banana"); input.add("Orange");input.add("Kiwi");

        partioningBasedOnLength(input);
    }

}
