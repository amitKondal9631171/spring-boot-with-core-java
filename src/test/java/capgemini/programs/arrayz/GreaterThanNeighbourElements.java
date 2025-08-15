package capgemini.programs.arrayz;

public class GreaterThanNeighbourElements {


    /**
     * int x [] is C-style array declaration
     * int[] x is Java-style array declaration
     */
    public static void main(String[] args) {

        int[] inputArray = {100,109, 908, 3145, 123, 543, 9897, 323};

        int previousElement=0, currentElement=0, nextElement=0 ;
        for (int i = 1 ; i < inputArray.length - 1; i++){
            previousElement = inputArray[i-1];
            currentElement = inputArray[i];
            nextElement = inputArray[i+1];
            if(currentElement > previousElement && currentElement > nextElement){
                System.out.println(currentElement);
                //break;
            }
        }

    }


}
