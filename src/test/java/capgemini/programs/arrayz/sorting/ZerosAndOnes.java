package capgemini.programs.arrayz.sorting;

import java.util.Arrays;

public class ZerosAndOnes {


    static void segregateArray(int arr[])
    {
         int left=0, right = arr.length-1;

         while(left < right){

             //Find the location of zero
             while (arr[left] == 0 && left < right) {
                 left++;
             }

             //Find the location of 1
             while (arr[right] == 1 && left < right) {
                 right--;
             }

             //replace the values and increment the indexes
             if (left < right)
             {
                 arr[left] = 0;
                 arr[right] = 1;
                 left++;
                 right--;
             }

         }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int[] unsortedArray = {1,0,1,0,0,0,0,0,0,0,0};

        /**
         * Out put must be:
         * {0,0,0,0,0,0,0,0,0,1,1};
         */
        segregateArray(unsortedArray);
    }

}
