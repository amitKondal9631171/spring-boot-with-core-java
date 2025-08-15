package techmahindra.dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionAlgo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell how many elements you want: ");
        int totalElements = scanner.nextInt();
        int[] elementArray = new int[totalElements+1];
        System.out.println("Please enter elements: ");

        for (int i = 0; i <= totalElements - 1; i++){
            elementArray[i] = scanner.nextInt();
        }

        System.out.println("Enter position where element needs to placed: ");
        int pos = scanner.nextInt();
        System.out.println("Enter position value to add: ");
        int value = scanner.nextInt();

        //moving the elements from the given location to right right
        //i = total - 1 => we added one extra free space during array initialization so, that we can add one more element
        for (int i = (totalElements - 1) ; i >= (pos - 1); i--){
            elementArray[i+1] = elementArray[i] ;
        }

        //Populate the given location with given value.
        elementArray[pos-1] = value;

        System.out.println(Arrays.toString(elementArray));
    }
}
