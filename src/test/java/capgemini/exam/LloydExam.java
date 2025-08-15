package capgemini.exam;

import java.util.ArrayList;
import java.util.List;

public class LloydExam {

    static String parseStringLine(String toListString){
        return toListString.endsWith("-") ? toListString.substring(0, toListString.length() - 1) : toListString;
    }

    private void wrapLines(String[] inputArray, int lineLength) {

        List<String> wordLines = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        String toListString="";

        for (String value : inputArray) {

            stringBuilder = stringBuilder.append(value);

            if(stringBuilder.toString().length() > lineLength){
                wordLines.add( parseStringLine( toListString ) );
                stringBuilder.setLength(0);
                toListString = stringBuilder.append(value).append("-").toString();
            }else{
                toListString = stringBuilder.append("-").toString();
            }

        }
        if(toListString.length()>1) {
            wordLines.add( parseStringLine( toListString ) );
        }

       System.out.println(wordLines);

    }

    public static void main(String[] argv) {
        String[] words1 = {"Amit Test","The", "day", "began", "as", "still", "as", "the", "night", "abruptly", "lighted", "with", "brilliant", "flame"};
        String[] words2 = {"Hello"};
        String[] words3 = {"Hello", "Hello"};
        String[] words4 = {"Well", "Hello", "world"};

        new LloydExam().wrapLines(words1, 13);
        new LloydExam().wrapLines(words2, 12);
        new LloydExam().wrapLines(words3, 14);
        new LloydExam().wrapLines(words4, 10);
    }

}
