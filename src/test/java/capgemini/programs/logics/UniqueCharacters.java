package capgemini.programs.logics;


public class UniqueCharacters {

    public static void main(String[] args) {
        String inputString = "asmklSNcksJnjvndsKl";

        char[] inputCharacters = inputString.toLowerCase().toCharArray();

        for (char character : inputCharacters){

            //First and Last Index must be same
            if(inputString.indexOf(character) == inputString.lastIndexOf(character))
                System.out.println("Unique character: "+ character);
        }


    }
}
