package capgemini.collections;

import java.util.*;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {

        List<String> list = List.of("Amit","Kondal","Seema","Devi");
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(element -> element, String::length));
        System.out.println(map);

        map = map.entrySet().stream().sorted((v1, v2) -> v1.getValue().compareTo(v2.getValue()))
                .collect(
                        Collectors
                                .toMap(
                                        Map.Entry::getKey,
                                        Map.Entry::getValue,
                                        (v1, v2) -> v1,
                                        LinkedHashMap::new
                                )
                );

        System.out.println(map);

     }

}
