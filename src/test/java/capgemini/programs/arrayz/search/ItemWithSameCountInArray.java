package capgemini.programs.arrayz.search;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Filter out the item which has same number of count in array.
 * e.g. below array item 3 is present 3 times
 */
public class ItemWithSameCountInArray {

    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 11, 8 , 1, 1 , 1, 1, 2, 2};

        Arrays.sort(arr);

        Map<Integer, Integer> values = new HashMap();

        for(Integer value : arr){
            Integer temp = values.get(value);
            if(Objects.nonNull(temp)){
                values.put(value, temp + 1);
            }else
                values.put(value, 1);
        }
        //Here filter is important and additionally added the code the sort the items also.
        Map<Integer, Integer> result = values.entrySet().stream().filter(entry -> entry.getKey().equals(entry.getValue()))
                //.sorted( (entry1, entry2) -> entry2.getKey().compareTo(entry1.getKey()))
                .collect // collect the sorted response in map
                (Collectors.toMap
                        (
                                Map.Entry::getKey // add key map
                                , Map.Entry::getValue // add key value
                               // ,(v1, v2) -> v1 // if both values are same then pick v1
                                //,LinkedHashMap::new // linked hash map to maintain the insertion order
                        )
                );

        System.out.println(result);
         //System.out.println(result.entrySet().iterator().next().getKey());
    }
}
