package capgemini.programs.arrayz;

import java.util.Arrays;
import java.util.List;

public class MultiDimensionArrayPractice {


    public static void main(String[] args) {

        int[][] matrix = new int[1][5];

        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[0][3]=3;
        matrix[0][4]=4;

        System.out.println(List.of(matrix));
    }

}
