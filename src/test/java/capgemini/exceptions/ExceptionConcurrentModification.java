package capgemini.exceptions;

import java.util.ArrayList;
import java.util.Iterator;

public class ExceptionConcurrentModification {

    static void listConcurrentModificationException(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);list.add(1);list.add(1);list.add(1);

        Iterator<Integer> listItr = list.iterator();

        while(listItr.hasNext()){
            listItr.next();
            list.add(2);
        }
    }

    public static void main(String[] args) {
        listConcurrentModificationException();
    }
}
