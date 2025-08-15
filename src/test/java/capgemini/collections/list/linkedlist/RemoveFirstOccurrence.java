package capgemini.collections.list.linkedlist;

import java.util.LinkedList;

public class RemoveFirstOccurrence {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        //Adding elements at the end of the list
        list.add("ONE");
        list.add("J2EE");
        list.add("THREE");
        list.add("J2EE");
        list.add("FIVE");
        list.add("J2EE");
        list.add("SEVEN");

        //Printing the elements of list
        System.out.println(list);      //Output : [ONE, J2EE, THREE, J2EE, FIVE, J2EE, SEVEN]
        //Removing the first occurrence of "TWO"
        list.removeFirstOccurrence("J2EE");
        //Removing the last occurrence of "J2EE"
        list.removeLastOccurrence("J2EE");

        System.out.println(list);

    }

}
