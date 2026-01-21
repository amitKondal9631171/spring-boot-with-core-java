package capgemini.exam;

import java.util.Arrays;

public class SaveMoreMice {

    static void savedMiceCopied(int [] x, int holeDistanceFromTom , int k){
        int ans = 0;
        int tomSteps = 0;
        //reverse oder so that we can save the mice near to the hole greedy approach
        // Tom 0 --1---2----3---4---5----6---7---8---9--- 10 (hole distance from tom (holeDistanceFromTom) )
        for (int i = k - 1; i>=0; i--) {
             int mouseDistance = x[i];
             int mouseSteps = holeDistanceFromTom - mouseDistance;
             tomSteps += mouseSteps;
             if(tomSteps  < holeDistanceFromTom){
                 ans++;
             }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {

        int n = 10, k = 6;
        int[] x = new int[]{8, 7, 5, 4, 9, 9};
        Arrays.sort(x);
        savedMiceCopied(x, n, k);

        n = 2; k = 8;
        x = new int[]{1, 1, 1, 1, 1, 1, 1, 1};
        Arrays.sort(x);
        savedMiceCopied(x, n, k);

        n = 12; k = 11;
        x = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Arrays.sort(x);
        savedMiceCopied(x, n, k);

    }

}
