package capgemini.programs.arrayz;

import java.util.Arrays;

public class RemovingDuplicates {

    static void removeDuplicates(int[] a){

        Arrays.sort(a);
        // {4, 2, -3, 4, -3, 1, 5}
        //{-3, -3, 1, 2, 4, 4, 4}
        //{-3, 1, 2, 2, 4, 4, 4}
        //{-3,1,2,4,5}
        int j = 0;

        for (int i = 0; i < a.length - 1; i++) {

            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
            System.out.println("Wait");
        }

        //this is for last element of the array as we excluded last element from the iteration
        //Last element is not added in the array so we need to add it.
        /*
         * {-3, -3, 1, 2, 4, 4, 4}
         *  4 == 4 == no action and increase the counter
         *  again 4 == 4 == no action and increase the counter
         *  array iteration is completed and last 4 th number remain pending to compare
         *  so, directly added to the array
         */

        a[j++] = a[a.length - 1];

        for (int k = 0; k < j; k++)
            System.out.println(a[k]);

    }

    public static void main(String[] args) {

        int[] numbersWithDuplicates = {4, 2, -3, 4, -3, 1, 4};
        removeDuplicates(numbersWithDuplicates);

    }

}
