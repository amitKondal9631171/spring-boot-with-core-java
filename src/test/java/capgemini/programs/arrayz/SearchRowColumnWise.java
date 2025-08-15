package capgemini.programs.arrayz;

public class SearchRowColumnWise {

    static void withQuadraticComplexity(int[][] mat, int size, int valueToFind){

        String index="";
        outLoop:
        for(int i=0 ; i< size; i++){
            for(int j=0 ; j< size; j++){
                if(mat[i][j] == valueToFind){
                    index = "["+ i + "," + j + "]";
                    break outLoop;
                }
            }
        }

        System.out.println( (index.length() > 1) ? (valueToFind + " found at " + index) : (valueToFind + " Not Found")  );

    }

    static void withLinearComplexity(int[][] mat, int size, int valueToFind){


        int i = 0, j = size - 1;

        while (i < size && j >= 0) {
            int value = mat[i][j];

            if (value == valueToFind) {
                System.out.print("Element found at " + i
                        + " " + j);
                return;
            }
            if (value > valueToFind)
                j--;
            else
                i++;
        }

        System.out.print("n Element not found");

    }


    public static void main(String[] args) {

        int[][] mat = {
                            {10, 20, 30, 40},
                            {15, 25, 35, 45},
                            {27, 29, 37, 48},
                            {32, 33, 39, 50}
                      };

        withQuadraticComplexity(mat, 4, 30);
        withQuadraticComplexity(mat, 4, 48);
        withQuadraticComplexity(mat, 4, 332);

        withLinearComplexity(mat, 4, 27);
        withLinearComplexity(mat, 4, 35);
        withLinearComplexity(mat, 4, 39);

    }

}
