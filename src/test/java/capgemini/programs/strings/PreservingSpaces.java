package capgemini.programs.strings;

//“I Am Not String” ==> “g ni rtS toNmAI”

public class PreservingSpaces {

    public static void main(String[] args) {
        String givenString = "I Am Not String";
        int endLoc = givenString.length() - 1;
        StringBuffer newString = new StringBuffer();
        for (int i = 0; i < givenString.length(); i++) {
            char frontChar = givenString.charAt(i);
            if (frontChar != ' ') {
                char check = givenString.charAt(endLoc) == ' ' ?
                        givenString.charAt(--endLoc) //ignore spaces from right to left
                        :
                        givenString.charAt(endLoc);

                newString.append(check);
                endLoc--;
            } else {
                newString.append(" ");
            }
        }
        System.out.println(newString);
    }

}