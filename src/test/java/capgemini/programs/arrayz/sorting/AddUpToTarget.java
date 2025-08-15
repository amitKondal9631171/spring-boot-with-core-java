package capgemini.programs.arrayz.sorting;

import java.util.HashMap;
import java.util.Map;

public class AddUpToTarget {

    static void twoSum(int[] arr, int target) {

        Map<Integer,Integer> hash = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            /*
             *  diff = target - arr[i]
             *  target = diff + arr[i]
             *  storedValue = target - currentValue
             *  target = storedValue + currentValue;
             *  19 - 10 = 9 ==> add 10 in map as key with index
             *  19 - 12 = 7 ==> add 12 in map as key with index
             *  19 - 23 = -4
             *  19 - 34 = -15
             *  19 - 25 = -6
             *  19 - 16 = 3
             *  19 - 7 = 12 ==> yes present in map
             */
            Integer diff = target - arr[i]; // difference = target - array element

            if(hash.containsKey(diff)){

                System.out.println("Element indexes : "+ hash.get(diff) + " , " + i);

            }

            hash.put(arr[i], i);

        }

    }


    public static void main(String[] args) {
        int[] inputArray = {10, 12, 23, 34, 25, 16, 7};
        twoSum(inputArray, 19);
    }

}
