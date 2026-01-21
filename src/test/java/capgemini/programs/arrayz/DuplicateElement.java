package capgemini.programs.arrayz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {

    static void findDuplicateElementWithIteration(int[] arrayWithDuplicateElement){

        Arrays.sort(arrayWithDuplicateElement);

        // because we need to parse till second last element less than not less than= arrayWithDuplicateElement.length - 1
        for (int i=0; i < arrayWithDuplicateElement.length - 1; i++){

            if (arrayWithDuplicateElement[i] == arrayWithDuplicateElement[i+1]){
                System.out.println("Duplicate Element with Iteration: "+ arrayWithDuplicateElement[i]);
            }

        }
    }

    static void findDuplicatesUsingMap(int[] arrayWithDuplicateElement){

        Map<Integer, Integer> arrayElementInfo = new HashMap();

        for (Integer integer : arrayWithDuplicateElement){

            if(arrayElementInfo.containsKey(integer))
                arrayElementInfo.put(integer, arrayElementInfo.get(integer) + 1);
            else
                arrayElementInfo.put(integer, 1);

        }

        arrayElementInfo.entrySet().stream().filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Duplicate element Using Map: "+ entry.getKey()));

    }
    public static void main(String[] args) {
        int[] arrayWithDuplicateElement = {1,2,3,2,1};

        findDuplicatesUsingMap(arrayWithDuplicateElement);
        findDuplicateElementWithIteration(arrayWithDuplicateElement);

        Arrays.stream(arrayWithDuplicateElement).forEach(
                value -> {

                    if(Arrays.stream(arrayWithDuplicateElement).filter(value1 -> value == value1).count() > 1)
                        System.out.println("Duplicate Using stream: " + value);

                }
        );
    }

}
