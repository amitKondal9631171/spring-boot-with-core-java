package capgemini.programs.arrayz;

import java.util.HashSet;
import java.util.Set;

/**
 * The idea is to iterate through the array and for every element arr[i],
 * calculate the sum of elements from 0 to i (this can simply be done as sum += arr[i]).
 * If the current sum has been seen before, then there must be a zero-sum sub array.
 */
public class ZeroSumSubArray {

    //  if any other combination has same sum then it will be a zero sum sub array
    static Boolean subArrayExists(int arr[])
    {
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to sum

            sum += arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) if any other combination has same sum then it will be a zero sum sub array
            if (arr[i] == 0 || sum == 0 || hs.contains(sum))
                return true;

            // Add sum to hash set
            hs.add(sum);
        }

        // We reach here only when there is
        // no sub array with 0 sum
        return false;
    }

    public static void main(String arg[])
    {
        int arr[] = {4, 2, -3, 1, 6};

        // Function call
        if (subArrayExists(arr))
            System.out.println(
                    "Found a subarray with 0 sum");
        else
            System.out.println("No Such Sub Array Exists!");
    }

}
