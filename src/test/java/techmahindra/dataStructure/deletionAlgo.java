package techmahindra.dataStructure;

import java.util.Scanner;

public class deletionAlgo {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell how many elements you want: ");
        int totalElements = scanner.nextInt();
        int[] elementArray = new int[totalElements];
        System.out.println("Please enter elements: ");

        for (int i = 0; i <= totalElements - 1; i++){
            elementArray[i] = scanner.nextInt();
        }

        System.out.println("Enter position from where element need to delete: ");
        int pos = scanner.nextInt();

        //Here we are just overriding the index entered by the consumer
        for (int i = pos ; i < elementArray.length; i++){
            elementArray[i-1] = elementArray[i] ;
        }
        System.out.println("Final array:");
        for (int k=0; k <= elementArray.length-2; k++)
            System.out.print(elementArray[k]+" ");
    }
}
