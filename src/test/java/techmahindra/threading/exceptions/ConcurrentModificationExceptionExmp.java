package techmahindra.threading.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentModificationExceptionExmp {

    static void exceptionExample() {
        List<String> list = new ArrayList<>();
        list.add("A");
        for (String s : list) {
            list.remove(s); // ❌ Throws ConcurrentModificationException
        }

    }

    static void howToHandle() {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("A");

            for(String s : list) {
                list.remove(s);

        }

    }

    public static void main(String[] args) {
        //exceptionExample();
        howToHandle();
    }
}
