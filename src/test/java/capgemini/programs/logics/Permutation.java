package capgemini.programs.logics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {

    public static void main(String args[])
    {
        int number = 756;
        new Permutation().findPermutation(number);
    }

    void findPermutation(int number)
    {
        int temp = number, count = 0;

        //count number of digits in given number
        while (temp > 0){
             count++;
             temp = temp / 10;
        }

        //take array of calculated number of digits
         int[] num = new int[count];

        //covert number to array of digits
        for(int i = 0; i < count ; i++)
        {
            num[i] = number % 10;// 756-6; 75 - 5; 07 - 7
            number = number / 10; // 75 ; 7
        }
        List<int[]> list = new ArrayList();
        findsNextPermutation(num, 0, list) ;
        list.forEach(permutation -> System.out.println(Arrays.toString(permutation)));
     }

    // 657
    void findsNextPermutation(int[] p, int cid, List<int[]> list)
    {

        if (cid == p.length - 1) {
            int[] array = new int[p.length];
            //we are passing original array which is getting updated with reference so, need to copy and then add to list
            System.arraycopy(p, 0 , array, 0, p.length);
            list.add(array);
            return ;
        }

        for(int i = cid; i < p.length; i++){

            swapNumbers(p, i, cid);
            findsNextPermutation(p , (cid+1), list);
            swapNumbers(p, i, cid);

        }

    }

    void  swapNumbers(int[] p, int i, int cid){
        int temp = p[i];
        p[i] = p[cid];
        p[cid] = temp;

    }

    void printPermutation(int[] p){

        System.out.println();
         for (int i : p){
            System.out.print( i + " ");
        }

    }
}
