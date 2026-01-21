package capgemini.programs.strings.regex;

import java.util.regex.Pattern;

/**
 * Metacharacters are characters with a special meaning
 */
public class Metacharacters {

    public static void main(String[] args) {
        System.out.println("-------------- Find a match for any one of the patterns separated by | ----------------");
        /**
         *  |
         *
         */
        String regex = "amit|kondal|vikas|seema";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println("Pattern matched ? " + pattern.matcher("Amit").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Amit Kondal").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Vikas Kondal").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Seema Kondal").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Arti").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Pranav Kondal").find());

        System.out.println("-------------- Finds a match as the beginning of a string----------------");
        /**
         *   ^
         * Finds a match as the beginning of a string as in: ^Amit
         */
        regex = "^Amit";
        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println("Pattern matched ? " + pattern.matcher("Amit").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Amit Kondal").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Kondal Amit").find());

        System.out.println("------------Finds a match at the end of the string------------------");
        /**
         *   $
         * Finds a match at the end of the string as in: kondal$
         */
        regex = "kondal$";
        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println("Pattern matched ? " + pattern.matcher("Amit").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Amit Kondal").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Kondal Amit").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Kondal Amit Kondal").find());

        System.out.println("-------------Find a digit-----------------");
        /**
         *   \d
         */
        regex = "\\d";
        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println("Pattern matched ? " + pattern.matcher("Am3it").find());
        System.out.println("Replace digit with blank ? " + pattern.matcher("A2mit K3ondal").replaceAll(""));

        System.out.println("-------------Find a space-----------------");
        /**
         *   \s
         */
        regex = "\\s";
        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println("Pattern matched ? " + pattern.matcher("Am3it").find());
        System.out.println("Replace digit with blank ? " + pattern.matcher("A2mit K3ondal").replaceAll(""));

        System.out.println("-------------Find a beginning or ending-----------------");
        /**
         *   \b
         * Find a digit
         */
        regex = "\\\\bKondal\b";
        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println("Pattern matched ? " + pattern.matcher("Amit is ok").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Amit Kondal").find());
        System.out.println("Pattern matched ? " + pattern.matcher("kondal amit").find());
        System.out.println("Pattern matched ? " + pattern.matcher("kondal amit kondal").find());


        System.out.println("------------- String that contains at least one n-----------------");
        /**
         *  n+
         */
        regex = "amit+";
        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println("Pattern matched ? " + pattern.matcher("Vikas is ok").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Amit Kondal").find());
        System.out.println("Pattern matched ? " + pattern.matcher("kondal amit").find());

        System.out.println("------------- String sequence of X n's-----------------");
        /**
         *  n{2}
         */
        regex = "amit{2}";
        pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println("Pattern matched ? " + pattern.matcher("Vikas amit amit amit ok").find());
        System.out.println("Pattern matched ? " + pattern.matcher("Amit Kondal").find());
        System.out.println("Pattern matched ? " + pattern.matcher("kondal amit").find());
        System.out.println("Pattern matched ? " + pattern.matcher("kondal amit amit").find());

    }
}
