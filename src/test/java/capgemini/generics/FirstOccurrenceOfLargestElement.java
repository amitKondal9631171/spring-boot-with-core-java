package capgemini.generics;

import java.util.List;

/**
 * Write a Java program to create a generic method that takes a list of any type and a target element.
 * It returns the index of the first occurrence of the target element in the list. Return -1 if the
 * target element cannot be found.
 */
public class FirstOccurrenceOfLargestElement{

    /**
     * This is a case of Binary search as we can sort the array and check if middle element is greater
     * than middle or not. if greater than compare with second half of the array else find in the first
     * half of the array.
     */
    static <T> int findIndexOfLargestElementWithLogN(List<Integer> inputList, Integer target){

        //time complexity is Log(n)

        int left = 0, mid = inputList.size() / 2, right = inputList.size() -1;

        while(left >= right){

            int midElement = inputList.get(mid);

            if (midElement == target)
                return target;

            if (midElement > target){

            }

        }


        return -1;
    }

    static <T> int findIndexOfLargestElement(List<T> inputList, T target){

        //time complexity is O(n)
        for (int i = 0; i < inputList.size(); i++){
            T currentValue = inputList.get(i);
            if( currentValue.equals(target) ){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
       int result =  findIndexOfLargestElement(List.of(3, 60, 35, 2, 45, 320, 5, 76, 22, 98, 999, 1000, 1029, 2500), 2500);
        System.out.println("Item index: "+result);
        result =  findIndexOfLargestElement(List.of("Amit", "Kondal", "Seema", "Kondal"), "Kondal");
        System.out.println("Item index: "+result);
        result =  findIndexOfLargestElement(List.of("Amit", "Kondal", "Seema", "Kondal"), "Amit Kondal");
        System.out.println("Item index: "+result);
    }

}
