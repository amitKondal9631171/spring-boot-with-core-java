package capgemini.programs.arrayz;

import java.util.Arrays;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {

        int[] inputArray = {1, 4, 0, 0, 3, 10, 5};
        /**
         * Iterate the array and maintain the values in Map as sum/element as key and value as array.
         * for every iteration check any map key is contributing to the sum if yes then read
         * the value for that key which will be a array and add the current value to that array
         * and print.
         */

        int[] subArray = null;

        int sum = 10, temp = 0, index=0;
        loop:
        for(int i = 0; i < inputArray.length; i++){

            subArray = new int[inputArray.length];

            temp = 0; index=0;

            for (int k = i; k< inputArray.length; k++){

                subArray[index++] = inputArray[k];

                temp += inputArray[k];

                if(temp > sum) //break if element sum is greater than given sum
                    break ;

                if(temp == sum) {
                    break loop;
                }

            }

        }

        inputArray = new int[index];

        for (int l=0; l < index; l++){
            inputArray[l] = subArray[l];
        }
        System.out.println(Arrays.toString(inputArray));

    }
}
