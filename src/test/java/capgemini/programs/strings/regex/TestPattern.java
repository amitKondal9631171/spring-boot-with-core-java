package capgemini.programs.strings.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPattern {

    public static void main(String[] args) {

        String type1 = "aeiou", type2 = "[aeiou]";

        Pattern pattern = Pattern.compile(type1, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("AmitKondal");
        System.out.println("Match found ? "+ matcher.find());

        pattern = Pattern.compile(type2, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher("AmitKondal");
        System.out.println("Match found ? "+ matcher.find());

    }
}
