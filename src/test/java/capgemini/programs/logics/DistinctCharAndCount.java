package capgemini.programs.logics;

public class DistinctCharAndCount {

    public static void main(String[] args) {

        String inputString = "kaLakdJjkjkjKJkjkJKJKjkjJjkjjiu";
        char[] characters = inputString.toCharArray();

        int index = 0;

        int firstIndex = inputString.indexOf('k', 0);
        int lastIndexOf = inputString.lastIndexOf('k', firstIndex);

        System.out.println();

    }
}
