package capgemini.collections;

import org.apache.commons.lang3.time.StopWatch;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionSort {

    public static void main(String[] args) {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        List<String>  studentList = new ArrayList<>();
        studentList.add("Vikas");
        studentList.add("Amit kondal");
        Collections.sort(studentList);
        System.out.println(studentList);

        Map<Integer, String> mapValues = new HashMap<>();
        mapValues.put(2,"Vikas");
        mapValues.put(3,"Amit");
        mapValues.put(1,"Seema");
        Set<Map.Entry<Integer, String>> mapSet = mapValues.entrySet();

        //decresing key
        List<Map.Entry<Integer, String>> list = mapSet.stream().sorted(Map.Entry.comparingByKey((o1, o2) -> o2-o1)).toList();
        System.out.println(list);

        //increasing key
        list = mapSet.stream().sorted(Map.Entry.comparingByKey((o1, o2) -> o1-o2)).toList();
        System.out.println(list);

        list = mapSet.stream().sorted(Map.Entry.comparingByKey()).toList();
        System.out.println(list);

    }

}
