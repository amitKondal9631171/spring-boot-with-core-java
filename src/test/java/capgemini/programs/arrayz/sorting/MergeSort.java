package capgemini.programs.arrayz.sorting;

import java.util.Arrays;

public class MergeSort {


    //O( n * log(n) )
    static void merge(int[] inputArray, int startIndex, int endIndex, int midIndex){

        if(inputArray[midIndex -1] <= inputArray[midIndex]) {
            return;
        }
        int i = startIndex, j = midIndex, tempIndex = 0;
        int[] temp = new int[endIndex - startIndex];
        //Right array
        while(i < midIndex && j < endIndex){
            temp[tempIndex++] = inputArray[i] <= inputArray[j] ? inputArray[i++] : inputArray[j++];
        }
        //copy left array
        System.arraycopy(inputArray, i, inputArray, startIndex + tempIndex, midIndex - i);
        System.arraycopy(temp, 0, inputArray, startIndex, tempIndex);

    }

    static void mergeSort(int[] inputArray, int startIndex, int endIndex){
        /**
         * condition of single element sub array reached
         */

        if(endIndex - startIndex < 2)
            return;

        int midIndex = (startIndex + endIndex) / 2;

        System.out.println("Left divide starts");
        mergeSort(inputArray, startIndex, midIndex);
        System.out.println("Left divide Ends");
        System.out.println("Right divide starts");
        mergeSort(inputArray, midIndex, endIndex);
        System.out.println("Right divide Ends");
        merge(inputArray, startIndex, endIndex, midIndex);

    }

    public static void main(String[] args) {
        int[] arr = { 0, 10, 2, -10, -20 };
        mergeSort(arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));
    }

}
