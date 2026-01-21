package capgemini.programs.logics;

public class RemoveCharactersFromString {

    public static void main(String[] args) {
        String inputString = "Aa2mit%^ Kon dal *";

        //remove all the characters which are not in between 0 - 9
        String onlyDigitCharacter = "[^0-9]";
        System.out.println(inputString.replaceAll(onlyDigitCharacter,""));

        String onlyAlphabetCharacter = "[^a-zA-Z]";
        System.out.println(inputString.replaceAll(onlyAlphabetCharacter,""));

        String onlySpecialCharacter = "[0-9a-zA-Z]";
        System.out.println(inputString.replaceAll(onlySpecialCharacter,""));

    }
}
