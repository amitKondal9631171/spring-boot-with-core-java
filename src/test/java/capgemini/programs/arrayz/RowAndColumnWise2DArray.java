package capgemini.programs.arrayz;

import java.util.Scanner;

public class RowAndColumnWise2DArray {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please mention 2-D array size: ");
        int arraySize = userInput.nextInt();

        int[][] matrixArray = new int[arraySize][arraySize];

        for (int i=0; i<arraySize; i++){

            for (int j=0; j<arraySize; j++){
                matrixArray[i][j] =userInput.nextInt();
            }

        }

        System.out.println("=====Rows=======");
        for (int i=0; i<arraySize; i++){
            System.out.print("Row " + i + ":");
            for (int j=0; j<arraySize; j++){
                System.out.print(" " +matrixArray[i][j]);
            }
            System.out.println();
        }

        System.out.println("=====Columns=======");

        for (int i=0; i<arraySize; i++){
            System.out.print("Column " + i + ":");
            for (int j=0; j<arraySize; j++){
                System.out.print(" " + matrixArray[j][i]);
            }
            System.out.println();
        }
    }

}
