package capgemini.collections;

import java.util.*;

/**
 * Iterators in Java are used to iterate over the Collection objects.
 * Fail-Fast: iterators immediately throw ConcurrentModificationException if there is a
 *            structural modification of the collection.
 * Structural modification means adding, or removing any element from a collection
 *             while a thread is iterating over that collection.
 *
 * When we add element in the arraylist then one variable with modeCount will be incremented.
 *   e.g. lets say we added 10 elements then modeCount will be 10.
 * Now, when we call Iterator method on list then modeCount value will be copied into new variable
 *      expectedModCount.
 * Now, while iterating list will validate for any modification by comparing both  modeCount & expectedModCount
 *  and if both are not same then it will throw concurrent modification exception.
 */

/**
 * Why fail fast:

 Structural modification breaks iteration consistency
     Collections like ArrayList, HashMap, etc., are not inherently thread-safe.
    When you iterate, the iterator walks through an internal structure — an array or a linked list.
     If another thread (or even the same thread) changes the structure (adds/removes elements), the iterator’s view of that structure becomes stale or invalid.
     You could end up:
          Skipping elements
          Seeing duplicates
    Reading invalid memory references
    So Java designers chose: better to fail fast than behave unpredictably.

 */

/**
 * What happens:
     The iterator in the first thread holds an internal snapshot of the collection’s modCount (modification count).
     The second thread changes the collection — say, adds or removes an element — which increments the collection’s modCount.
     The next time the first thread’s iterator calls next(), it compares:
     if (modCount != expectedModCount)
         throw new ConcurrentModificationException();
      — and boom 💥, you get a ConcurrentModificationException.
 */
public class FailFastAndSafe {

    static void withMultipleThreads(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        new Thread(() -> {
            for (String s : list) {
                System.out.println(s);
                try { Thread.sleep(50); } catch (InterruptedException e) {}
            }
        }).start();

        new Thread(() -> {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            list.add("D"); // modifies while first thread iterates
        }).start();

    }

    public static void main(String[] args) {
        withMultipleThreads();
    }
}
