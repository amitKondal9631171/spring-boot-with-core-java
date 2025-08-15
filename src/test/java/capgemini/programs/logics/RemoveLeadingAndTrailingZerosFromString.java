package capgemini.programs.logics;

public class RemoveLeadingAndTrailingZerosFromString {

    public static void main(String[] args) {

        String stringWithLeadingAndTrainingSpaces = "\t amit \n ";

        //Strip and Trim both are same only makes difference when works based on Uni codes
        System.out.println(stringWithLeadingAndTrainingSpaces.trim());

        System.out.println(stringWithLeadingAndTrainingSpaces.strip());
        System.out.println(stringWithLeadingAndTrainingSpaces.stripLeading());
        System.out.println(stringWithLeadingAndTrainingSpaces.stripTrailing());
    }
}
