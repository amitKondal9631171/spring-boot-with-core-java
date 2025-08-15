package capgemini.programs.logics;

import java.util.Arrays;
import java.util.Comparator;

public class SortCommaSeparatedString {

    public static void main(String[] args) {

        String inputString = "Vika,Pawan,Seema,Arti,Meenakashi,Pawan,shakhu,kondal";
        String[] words = inputString.split(",");
        Comparator<String> rule = String::compareTo;
        Arrays.sort(words);

        String response = String.join(",", words);

        System.out.println(response);
    }

}
