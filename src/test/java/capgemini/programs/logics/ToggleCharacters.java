package capgemini.programs.logics;

public class ToggleCharacters {

    public static void main(String[] args) {
        String inputString = "1AmIt9";

        /**
         *  ^ means negate like != [characters not from a-z and A-Z
         *  [a-zA-Z] means characters from a-z and A-Z
         */
        String regularExp = "[^a-zA-Z]";

        //removing all the characters which are not alphabet
        inputString = inputString.replaceAll(regularExp,"");

        char[] res = new char[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {

            char character = inputString.charAt(i);

            int modifiedChar =  (character >= 'A' && character <= 'Z')
                                ?
                                character + 32 : character - 32;

            res[i] = (char) modifiedChar;

        }
        System.out.println(res);

    }
}
