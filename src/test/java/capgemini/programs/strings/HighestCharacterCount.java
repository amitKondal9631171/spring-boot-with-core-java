package capgemini.programs.strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestCharacterCount {

    public static void main(String[] args) {

        String inputString = "aaaaaaaaaaaaaaaaabbbbcddddeeeeee";
        //sort the array
        char[] arrayChar = inputString.toCharArray();
         int count[] = new int[inputString.length()];
        int len = inputString.length();
        for (int i = 0; i < len; i++)
            count[i] = inputString.charAt(i);

        System.out.println(Arrays.toString(count));

        String[] stringArray = {"Amit", "Kondal", "seema devi", "Vikas", "Arti Dohar"};
        Comparator<String> stringComparator = (v1 , v2) -> Integer.compare(v1.length(), v2.length()) ;
        Arrays.sort(stringArray, stringComparator);
        System.out.println(Arrays.toString(stringArray));
    }
}
