package capgemini.programs.arrayz;

import java.util.Arrays;

public class ReverseArrayWithoutUsingExtraSpace {

    public static void main(String[] args) {

        int[] inputArray = {5,4,3,15,6,7,32,51,6,22};
        int j = inputArray.length-1;

        //check condition with /2 as we need to exchange value till the middle of the array
        //Swap the items
        for(int i = 0; i < inputArray.length/2; i++){

            int tempValue = inputArray[i];
            inputArray[i]=inputArray[j];
            inputArray[j]=tempValue;

            j--;

        }

        System.out.println(Arrays.toString(inputArray));
    }
}
