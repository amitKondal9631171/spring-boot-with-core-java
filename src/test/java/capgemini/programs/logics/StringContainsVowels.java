package capgemini.programs.logics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContainsVowels {

    public static void main(String[] args) {

        String vowelRegex = "[aeiou]";
        System.out.println("TV".toLowerCase().matches(vowelRegex)); // false
        System.out.println("Hello".toLowerCase().matches(vowelRegex)); // true


        //Internally the above operation is performing
        Pattern p = Pattern.compile(vowelRegex);
        Matcher m = p.matcher("Hello");
        System.out.println(m.matches()); // true


    }

}
