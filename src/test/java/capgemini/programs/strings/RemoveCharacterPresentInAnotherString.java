package capgemini.programs.strings;

public class RemoveCharacterPresentInAnotherString {

    public static void main(String[] args) {

        String first = "computer", second = "cat";


        String response = first.replaceAll("["+second+"]","");

        System.out.println(response);

    }
}
