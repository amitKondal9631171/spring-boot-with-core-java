package capgemini.programs.arrayz;

import java.util.Arrays;

public class ArraySameElements {

    public static void main(String[] args) {

        int[] arrayWithDuplicateElement1 = {1,2,3,2,1,9};
        int[] arrayWithDuplicateElement2 = {3,1,22,2,1};

        //do it with array comparison
        Arrays.sort(arrayWithDuplicateElement1);
        Arrays.sort(arrayWithDuplicateElement2);
        boolean identical=true;

        for(int i=0 ; i< arrayWithDuplicateElement1.length ; i++){
            if(arrayWithDuplicateElement1[i] != arrayWithDuplicateElement2[i]) {
                identical = false;
                break;
            }
        }
       System.out.println("Arrays are identical ?: "+ identical);
    }
}
