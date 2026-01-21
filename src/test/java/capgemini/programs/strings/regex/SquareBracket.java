package capgemini.programs.strings.regex;

import java.util.regex.Pattern;

public class SquareBracket {


    public static void main(String[] args) {

        /**
         * Then given regex will compare each character with given string
         * "Amb" this regex is complete string comparison with given string
         */
        String regex = "^[Abc]";

        Pattern pattern = Pattern.compile(regex);

        System.out.println( pattern.matcher("Amit").find() );

        regex = "[Abc0-9\\s]";

        pattern = Pattern.compile(regex);

        System.out.println( pattern.matcher("Vikas kondal").find() );// true as contains space
        System.out.println( pattern.matcher("Vikas01").find() );// true as contains number
    }

}
