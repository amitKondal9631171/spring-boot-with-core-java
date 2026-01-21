package interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyAndSort {

    public static void main(String[] args) {

        String input = "My Is is amit My and I belongs kangra my place is kangra";

        Map<String, Long> map = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(
                            Collectors.toMap(
                                    Map.Entry::getKey ,
                                    Map.Entry::getValue
                                    ,(v1,v2) -> v1
                                    , LinkedHashMap::new
                            )
                );

        System.out.println(map);


    }
}
