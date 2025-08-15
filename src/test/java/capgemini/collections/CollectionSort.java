package capgemini.collections;

import org.apache.commons.lang3.time.StopWatch;

import java.util.*;

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

        List<Map.Entry<Integer, String>> entryList = new ArrayList<Map.Entry<Integer, String>>(mapSet);

        Collections.sort(entryList , (v1, v2) -> {

            return v1.getValue().compareTo(v2.getValue());

        });

        System.out.println("Sorted by value: " + entryList);

        Collections.sort(entryList , (v1, v2) -> {

            return v1.getKey().compareTo(v2.getKey());

        });

        System.out.println("Sorted by value: " + entryList);
        
        stopWatch.stop();

        System.out.println("Total time taken in MS: "+stopWatch.getTime());
    }

}
