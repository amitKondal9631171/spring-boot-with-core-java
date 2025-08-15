package capgemini.programs.arrayz.search;

import java.util.Arrays;
import java.util.Scanner;

public class ThirdLargest {

    static void findNthElement(int[] inputArray){

        int first = 0, second = 0, third = 0;

        for (int i=0; i < inputArray.length; i++){

            int currentNumber = inputArray[i];

            if (currentNumber > first){
                third = second;
                second = first;
                first = currentNumber;
            }else if(currentNumber > second){
                third = second;
                second = currentNumber;
            }else if(currentNumber > third)
                third = currentNumber;

        }

        System.out.println("First: "+ first + ", Sec: "+ second + ", Third: "+ third);

    }

    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        int arrayLength = scanInput.nextInt();
        int[] inputArray = {21,33,222,1111,4444,22,48, 25, 36};
        findNthElement(inputArray);
        //With Sorting
        Arrays.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));
        System.out.println("Third highest: "+inputArray[inputArray.length-3]);

    }
}
