package capgemini.programs.arrayz;

import java.util.List;

public class FirstOccurrenceOfLargestElement {


    static void findIndexOfLargestElement(List<Integer> inputList){

        int index = 0, largestElement = 0;

        for (int i = 0; i<inputList.size(); i++){
            int currentValue = inputList.get(i);
            if(currentValue > largestElement){
                index = i;
                largestElement = currentValue;
            }
        }
        System.out.println("Largest Element: "+ largestElement + ", Index: "+ index);
    }

    public static void main(String[] args) {

        findIndexOfLargestElement(List.of(54555,3,2,1,5,3,2,2,222,3,54555,222,54555));

    }

}
