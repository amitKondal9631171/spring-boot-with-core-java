package capgemini.programs.arrayz.search;

import java.util.Arrays;

public class BinarySearch {

    //Binary search is applicable for sorted arrays
   static int binarySearch(int[] arr, int x)
    {
        int l = 0, r = arr.length - 1;

        while (l <= r) {

            /**
             * find the middle of array
             * mid = left + ( right - left ) / 2
             * e.g. middle of 5 & 10 ( 1,2,3,4,5,6,7,8,9,10 )
             * 5 + (10-5)/2 = 5 + 2 = 7 => If item is greater than middle
             * 0 + (4-0)/2 = 0 + 2 = 2 => If item is smaller than middle
             */
            int m =  l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }

        // Element not found
        return -1;
    }

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5, 6};

        //Binary Search is applicable for sorted arrays
        Arrays.sort(inputArray);

        System.out.println("Index of selected Item: " + binarySearch(inputArray, 2) );

    }
}
