package capgemini.programs.logics;

import java.util.Arrays;

public class MissingFirstPositiveInteger {

    public static void main(String[] args) {
        int[] arr = { -1,-3 , 1, 2, 3,6,7,8,9};

        Arrays.sort(arr);
        int ans = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ans) {
                ans++;
            }

        }

        System.out.println(ans);
    }
}
