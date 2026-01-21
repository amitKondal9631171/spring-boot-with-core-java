package capgemini.programs.arrayz.sorting;

import java.util.Arrays;

public class RotateArraysElements {

    static void rotateElements(int[] inputArray , int iterations){
        int lastIndex = inputArray.length;//4

        //rotate array from left to right
        if (iterations < 0){
            int p = 1;

            //Iterate the arrays with given number of iterations
            while (p <= Math.abs(iterations)) {
                int firstElement = inputArray[0];
                for (int i = 0; i < lastIndex - 1; i++) {
                    inputArray[i] = inputArray[i + 1];
                }
                inputArray[lastIndex - 1] = firstElement;
                p++;
            }

        }

        //Iterate the array from right to left
        if (iterations > 0){

            int p = 1;
            while (p <= iterations) {
                int lastElement = inputArray[lastIndex - 1];
                //start picking up the second last element of array and add in the last index
                for (int i = lastIndex - 2; i >=0 ; i--) {
                    inputArray[i+1] = inputArray[i];
                }
                inputArray[0] = lastElement;
                p++;
            }

        }
        System.out.println(Arrays.toString(inputArray));
    }

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        rotateElements(inputArray,2);
        //rotateElements(inputArray,3);
    }

}
