package capgemini.programs.arrayz;

import java.util.Scanner;

public class PrintMatrixArrayInWaveForm {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter number of rows for 2-D array: ");
        int rowSize = userInput.nextInt();
        System.out.println("Enter number of columns for 2-D array: ");
        int columnSize = userInput.nextInt();

        int[][] matrixArray = new int[rowSize][columnSize];

        for (int i=0; i<rowSize; i++){

            for (int j=0; j<columnSize; j++){
                matrixArray[i][j] =userInput.nextInt();
            }

        }

        System.out.println("=====Rows=======");

        for (int columnCount=0; columnCount < columnSize; columnCount++){

            System.out.print("Row " + columnCount + ":");

            //even rows
            if(columnCount%2 == 0) {
                for (int rowCount = 0; rowCount < rowSize; rowCount++) {
                    System.out.print(" " + matrixArray[rowCount][columnCount]);
                }
            } else { //Odd rows
                for (int j = (rowSize - 1); j >= 0; j--) {
                    System.out.print(" " + matrixArray [j] [columnCount]);
                }
            }

            System.out.println();
        }

    }

}
