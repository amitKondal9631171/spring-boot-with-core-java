package capgemini.programs.arrayz;

import java.util.Arrays;

public class IntersectionOfArrays {

    /**
     * 1. Order both arrays
     * 2. Take 2 pointers for both the arrays
     * 3. Compare for arrays elements at locations
     * 4. if elements are equal then print
     * 5. check which array element is small and increment the pointer for that array,
     *    so that next element of that array npw can be compare
     */
    static void intersectArrays(int[] a, int[] b){

        Arrays.sort(a);
        Arrays.sort(b);

        int array_A_Length = a.length, array_B_Length = b.length;
        int i = 0, j = 0;

        while(i < array_A_Length && j < array_B_Length ){

            //It means compare a element with next element of b array
            if (a[i] > b[j]) {
                j++;
            }else if (a[i] < b[j]) { // It means compare b array element with next element of a array
                i++;
            }else { // If a[i] is not greater or less than b[j], It means both are equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }


        }

    }

    public static void main(String[] args) {

        int[] a1 = {101,109, 908, 345, 123, 543, 897, 323};
        int[] a2 = {201,109, 308, 345, 923, 543, 797, 323};

        intersectArrays(a1, a2);
        System.out.println();

        Arrays.stream(a1).forEach(v -> {

            if(Arrays.stream(a2).anyMatch(v1 -> v1 == v)){

                System.out.println( v );

            }


        });

    }

}
