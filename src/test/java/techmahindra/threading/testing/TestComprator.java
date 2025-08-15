package techmahindra.threading.testing;

import java.util.Comparator;

/**
 * Created by user on 8/10/2020.
 */
public class TestComprator {

    public static void main(String[] args) {
        Comparable<Integer> testingCompLambda = (a1) ->  {

            return 1;
        };
        Comparator<Integer> comparator = (a1, b1) ->  {
            a1.equals(b1);
            return 1;
        };
    }

}
