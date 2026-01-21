package capgemini.collections.stacks;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {


    public static void main(String[] args) {
        int[] input = {4,3,1,3,5,4,3,5,6,7,8};
        /*Stack<Integer> stack = new Stack<>();
        for(Integer value : input){
            stack.push(value); // array elements moved to stack.
        }

        int i=0;
        while(!stack.empty()){
            input[i++] = stack.pop(); // no need to take new array as we can use old array
        }*/

        //System.out.println("Reverse Array: " + Arrays.toString(input));

        for(int k =0; k < input.length / 2  ; k++){

            int lastIndex = (input.length - k) - 1;

            int frontValue = input[k];
            int rareValue = input[lastIndex];
            input[k] = rareValue;
            input[lastIndex] = frontValue;
        }
        System.out.println("Reverse Array: " + Arrays.toString(input));
    }
}
