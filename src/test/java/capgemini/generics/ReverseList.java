package capgemini.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseList {

    /*
        List iterator works on both forward and backward direction.
     */

    public static void main(String[] args) {

        List<String> inputList = List.of("Amit", "Kondal", "Seema", "Kondal");
        List<String> reverseList = new ArrayList();

        ListIterator<String> itr = inputList.listIterator(inputList.size());
        while(itr.hasPrevious()){
            String previousElement = itr.previous();
            reverseList.add(previousElement);
        }
        System.out.println(reverseList);


    }
}

