package capgemini.programs.logics;

public class CountVowelsConsonantsAndOthers {

    /**
     * Consonant are other than vowels
     */

    static String vowelRegex = "[aeiou]";


    static boolean isVowel(char ch){
        return String.valueOf(ch).matches(vowelRegex);
    }

    public static void main(String[] args) {

        String alphabetCharacters = "[^a-zA-Z]";
        String inputString = "A#zyu*2e";

        inputString = inputString.replaceAll(alphabetCharacters,"");
        System.out.println("Alphabet Characters: "+ inputString);

        char[] inputCharacters = inputString.toLowerCase().toCharArray();
        long consonantCount=0, vowelCount=0;

        for (char character : inputCharacters){

            if(isVowel(character)){
                vowelCount++;
            }else
                consonantCount++;
        }

        System.out.println("consonantCount: "+ consonantCount + ", vowelCount: " + vowelCount);
    }
}
