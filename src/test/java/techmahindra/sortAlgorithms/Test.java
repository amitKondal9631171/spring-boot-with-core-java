package techmahindra.sortAlgorithms;

import java.util.Arrays;

/**
 * Created by HP-USER on 24-06-2019.
 */
public class Test {



    public static void main(String[] args) {
        CustomSort[] empArr = new CustomSort[4];
        empArr[0] = new CustomSort(10, "Mikey", 25, 10000);
        empArr[1] = new CustomSort(20, "Arun", 29, 20000);
        empArr[2] = new CustomSort(5, "Lisa", 35, 5000);
        empArr[3] = new CustomSort(1, "Pankaj", 32, 50000);
        //Arrays.sort(empArr, CustomSort.AgeComparator);
        Arrays.sort(empArr);
        System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));
    }
}
