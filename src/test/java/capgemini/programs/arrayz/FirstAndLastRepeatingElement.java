package capgemini.programs.arrayz;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastRepeatingElement {

    static void firstRepeatedElement(int[] arrayWithDuplicateElement){
        List<Integer> tempList = new ArrayList<>();
        int firstDuplicate = -1;
        for(int i = 0; i < arrayWithDuplicateElement.length ; i++){
            if(tempList.contains(arrayWithDuplicateElement[i])){
                firstDuplicate = arrayWithDuplicateElement[i];
                break;
            }else
                tempList.add(arrayWithDuplicateElement[i]);

        }

        System.out.println("First duplicate element: "+firstDuplicate);

    }

    static void lastRepeatedElement(int[] arrayWithDuplicateElement){
        List<Integer> tempList = new ArrayList<>();
        int lastDuplicate = -1;

        for(int i = arrayWithDuplicateElement.length - 1; i >=0 ; i--){
            if(tempList.contains(arrayWithDuplicateElement[i])){
                lastDuplicate = arrayWithDuplicateElement[i];
                break;
            }else
                tempList.add(arrayWithDuplicateElement[i]);

        }

        System.out.println("Last duplicate element: "+lastDuplicate);

    }
    public static void main(String[] args) {

        int[] arrayWithDuplicateElement = {2,1,2,3,2,1};

        firstRepeatedElement(arrayWithDuplicateElement);

        lastRepeatedElement(arrayWithDuplicateElement);
    }


}
