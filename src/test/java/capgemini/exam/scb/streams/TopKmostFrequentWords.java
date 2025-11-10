package capgemini.exam.scb.streams;

import org.apache.logging.log4j.util.PropertySource;
import org.assertj.core.internal.Comparables;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKmostFrequentWords {

    public static void main(String[] args) {

        String para = "Java is great, and Java is powerful. Spring is Java based.";

        Map<String, Long> collect = Arrays.asList(para.split(" "))
                .stream()
                .collect(Collectors.groupingBy(values -> values, Collectors.counting()));

        //System.out.println(collect);

        collect.entrySet().stream()
                .sorted((a, b) -> {
                    int cmp = Long.compare(b.getValue(), a.getValue());
                    return cmp == 0 ? a.getKey().compareTo(b.getKey()) : cmp;
                })
                .limit(2)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

    }

}
