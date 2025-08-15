package capgemini.collections;

import java.util.List;

/**
 * This is a Runtime exception that is a member of the Java Collections Framework.
 */
public class UnsupportedException {

    public static void main(String[] args) {
        int x = 5;
        System.out.println(x++ + ++x);
        //List.of return immutable list which can not be modified
        List<Integer> list = List.of(1,2,3,4); //List.of return immutable list.

        list.remove(1); // will get unsupported exception as we can't modify immutable list
        //list.add(5);// will get unsupported exception as we can't modify immutable list
    }
}
