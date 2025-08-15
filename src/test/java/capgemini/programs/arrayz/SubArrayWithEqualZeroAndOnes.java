package capgemini.programs.arrayz;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithEqualZeroAndOnes {

    public static void main(String[] args) {

        int[] inputArray = {1, 0, 0, 1, 0, 1, 1};

        Map<Integer, Integer> um = new HashMap<>();
        int curr_sum = 0, count = 0;

        for (int i = 0; i < inputArray.length; i++) {
            curr_sum += (inputArray[i] == 0) ? -1 : inputArray[i];
            um.put(
                    curr_sum, um.get(curr_sum) == null ? 1 : um.get(curr_sum) + 1
            );

            System.out.println(um);
        }

        for (Map.Entry<Integer, Integer> itr :
                um.entrySet()) {

            // with a particular for arrays combinations are calculated as n * (n-1)/2
            if (itr.getValue() > 1)
                count += ((itr.getValue()
                        * (itr.getValue() - 1))
                        / 2);
        }
        if (um.containsKey(0))
            count += um.get(0);

        System.out.println(count);
    }


}
