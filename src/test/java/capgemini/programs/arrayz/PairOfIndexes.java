package capgemini.programs.arrayz;

import java.util.Arrays;

public class PairOfIndexes {


    public static void printPairsUsingTwoPointers(int[] numbers, int k) {
        if (numbers.length < 2) {
            return;
        }
        //Sort the array
        Arrays.sort(numbers);
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum == k) {
                System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
                left++;
                right--;
            } else if (sum < k) {
               left++;
            } else {
                right--;
            }

        }
    }


    public static void main(String[] args) {
        int[] a1 = {2, 4, 7, 5, 9, 10, -1};

        printPairsUsingTwoPointers(a1,9);
    }

}
