package capgemini.programs.arrayz.sorting;

import java.util.Arrays;

public class SortIntegers {

    /*
    This is same as bubble sort but the difference is:
        bubble sort: take largest element to the right
        this sort: takes smallest element to the left
     */
    public static void main(String[] args) {

        int[] arr = { 0, 10, 2, -10, -20 };
        //O(n)
        for (int i = 0; i < arr.length; i++){

            int k = i;

            while ( k < arr.length-1){

                if(arr[i] > arr[++k]) {
                    int indexValue = arr[i];
                    arr[i] = arr[k];
                    arr[k] = indexValue;
                }

            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
