package capgemini.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Operations {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();//default capacity is 16
        list.add("Amit");
        System.out.println("At index 0: "+list.get(0));
        //System.out.println("At index 1: "+list.get(1)); //Index Out Of Bound Exception

        //will add the element at 0 and right hand side sifting will happen.
        list.add(0,"Kondal"); //It will add value at index 0 and move the 0 Index value to 1

        System.out.println("At index 0: "+list.get(0));
        System.out.println("At index 1: "+list.get(1));

        //Set will replace the element
        list.set(0,"Bhai");
        System.out.println(list);
        //Retrieving a SubList

        //Retrieve portion of list
        List<String> subList = list.subList(1, 4);

        //Remove all elements of list
        list.clear();
        System.out.println(list);

        ArrayList<String> list02 = new ArrayList<String>(5);
        list02.add("Amit");
        list02.add("Vikas");
        list02.add("Meena");
        list02.add("Arti");
        list02.add("Seema");
        list02.trimToSize();
        list02.add("Ananya");

        System.out.println(list02);

        //Capable of iterating the list into forward and backward direction
        ListIterator<String> lstItr = list02.listIterator();
        while(lstItr.hasPrevious()){
        }
    }

}
