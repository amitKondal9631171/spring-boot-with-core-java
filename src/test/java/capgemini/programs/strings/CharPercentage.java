package capgemini.programs.strings;

public class CharPercentage {

    public static void main(String[] args) {

        String givenString = "I am not the Best";
        int totalChars = givenString.length();
        int upperCaseLetters = 0, lowerCaseLetters = 0, digitLetter = 0, specialLetters = 0;

        for (char currentChar : givenString.toCharArray()) {
            if (Character.isUpperCase(currentChar)) {
                upperCaseLetters++;
            }
            if (Character.isLowerCase(currentChar)) {
                lowerCaseLetters++;
            }
            if (Character.isDigit(currentChar)) {
                digitLetter++;
            }
            if(Character.isSpaceChar(currentChar)){
                specialLetters++;
            }
        }
        double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars;
        double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;
        double digitsPercentage = (digitLetter * 100.0) / totalChars;
        double otherCharPercentage = (specialLetters * 100.0) / totalChars;
        System.out.println("Upper: " + upperCaseLetterPercentage);
        System.out.println("Lower: " + lowerCaseLetterPercentage);
        System.out.println("Digit: " + digitsPercentage);
        System.out.println("Special: " + otherCharPercentage);
    }

}
