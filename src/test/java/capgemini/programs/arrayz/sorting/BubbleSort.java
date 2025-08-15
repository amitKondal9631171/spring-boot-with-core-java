package capgemini.programs.arrayz.sorting;

import java.util.Arrays;

public class BubbleSort {

    static void swapElements(int[] inputArray, int index1, int index2){

        if(index1 == index2)
            return;

        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;

    }
    static void bubbleSort(int[] inputArray){

        /*
         * Initially last unsorted array index will be length of array.
         * then gradually it will decrease the length as last element will be sorted only
         */
        for(int lastUnSortedIndex = inputArray.length - 1; lastUnSortedIndex>=0; lastUnSortedIndex--){
            for (int j = 0; j < inputArray.length - 1; j++){
                if(inputArray[j] > inputArray[j+1]){
                    swapElements(inputArray, j, (j+1));
                }
            }
        }
        System.out.println(Arrays.toString(inputArray));
    }

    public static void main(String[] args) {

        int[] arr = {0, 10, 2, -10, -20};
        bubbleSort(arr);

    }
}
