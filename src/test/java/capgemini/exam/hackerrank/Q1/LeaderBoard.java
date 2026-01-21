package capgemini.exam.hackerrank.Q1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class LeaderBoard {

    public static void main(String[] args) {

        int [] scores = {100, 90, 90, 80};
        int [] player = {70, 80, 105};

        IntSummaryStatistics statistics = IntStream.range(0, scores.length).sorted().summaryStatistics();



        int pos = Arrays.binarySearch(scores, 99);

        // If found, binarySearch returns index
// If not found, it returns (-(insertion point) - 1)
        if (pos < 0) {
            pos = -(pos + 1);
        }

        System.out.println("Insert at index: " + pos);  // 3
    }
}
