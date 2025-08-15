package capgemini.programs.arrayz.sorting;

import java.util.Arrays;

public class ZerosOnesAndTwos {
    final static ZerosOnesAndTwos test = new ZerosOnesAndTwos();
    static ZerosOnesAndTwos test2 = new ZerosOnesAndTwos();
    static void swapTwoNumbers(int[] inputArray , int left, int right){
        // test= test2;
        int leftDigit = inputArray[left], rightDigit =  inputArray[right];
        leftDigit = leftDigit + rightDigit;
        rightDigit = leftDigit - rightDigit;
        leftDigit = leftDigit - rightDigit;

        inputArray[left] = leftDigit;
        inputArray[right] = rightDigit;

    }
    public static void main(String[] args) {
        int[] inputArray = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

        int left = 0, mid = 0, right = inputArray.length-1;

        while (left < right){

            if (inputArray[left] > inputArray[mid]){
                swapTwoNumbers(inputArray, left, mid);
                left++;
            }


            if (inputArray[mid] > inputArray[right]){
                swapTwoNumbers(inputArray, mid, right);
                right--;
            }else
                mid++;

        }

        System.out.println(Arrays.toString(inputArray));
    }
}
