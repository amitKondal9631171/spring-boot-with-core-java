package capgemini.programs.arrayz;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeatingCharacter {

    static void firstNonRepeatingCharacterInString(String inputString){

        if(inputString.length()<=1) {
            System.out.println( inputString.length() == 0 ? "" : inputString );
            return;
        }

        for (int i = 0; i < inputString.length(); i ++){
            char c = inputString.charAt(i);
            if(inputString.indexOf(c) == inputString.lastIndexOf(c)){
                System.out.println("First Non Repeated Element: "+ c);
                break;
            }

        }
    }

    public static void main(String[] args) {

        firstNonRepeatingCharacterInString("AmnitimA");

        Integer[] arrayWithDuplicateElement = {9, 4, 9, 6, 7, 4};

        Set<Integer> tempList = new LinkedHashSet<>();

        //Iterating the array from right to left so, that we can get the minimum duplicate item index
        for(int i = 0; i < arrayWithDuplicateElement.length ; i++){

            if(tempList.contains(arrayWithDuplicateElement[i]))
                tempList.remove(arrayWithDuplicateElement[i]);
            else
                tempList.add(arrayWithDuplicateElement[i]);

        }

        System.out.println(tempList.stream().findFirst().get());

    }


}
