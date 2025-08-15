package capgemini.programs.logics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Queue;
import java.util.Stack;

public class RemoveDuplicatesFromSortCommaSeparatedString {

    public static void main(String[] args) {

        String inputString = "Vikas,Pawan,Seema,Arti,Meenakashi,Pawan,shakhu,kondal,Seema,Vikas,arti";
        String[] words = inputString.split(",");
        Comparator<String> rule = String::compareToIgnoreCase;
        Arrays.sort(words,rule);
        String[] temp = new String[words.length];
        int j=0,duplicateCount=0;
        for(int i=0; i < words.length - 1; i++){

            if(! words[i].equalsIgnoreCase(words[i + 1]) ){
                temp[j++] = words[i];
                continue;
            }
            duplicateCount++;
        }
        temp[j] = words[words.length-1];
        words = new String[temp.length-duplicateCount];
        System.arraycopy(temp,0, words, 0, temp.length-duplicateCount);
        String response = String.join(",", words);

        System.out.println(response);
    }

}
