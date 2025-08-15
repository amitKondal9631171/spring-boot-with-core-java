package capgemini.exceptions;

import java.util.ArrayList;
import java.util.ListIterator;

public class StateExceptionIllegal {

    static void listStateException() {
        ArrayList<String> list = new ArrayList<String>();
// adding elements to the ArrayList
        list.add("Nirnay");
        list.add("Anu");
        list.add("Swara");
        list.add("Pavan");
// creating the iterator object to iterate the list
        ListIterator<String> it = list.listIterator();
// removing the element without moving to first position
// gives an exception
        it.remove();
    }

    static void StateExceptionIllegalException() {
        Runnable r1 = () -> {

            for (int i = 0; i < 3; i++) {
                // displaying the text
                System.out.println("This is example of IllegalStateException");
            }

        };

        Thread t1 = new Thread(r1);

        t1.start();

        // starting the thread again when it is already running
        // this gives an exception
        t1.start();
    }

    public static void main(String[] args) {

        StateExceptionIllegalException();
        listStateException();
    }
}
