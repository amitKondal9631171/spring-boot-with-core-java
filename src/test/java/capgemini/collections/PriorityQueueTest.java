package capgemini.collections;

import capgemini.entities.Student;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * What is PriorityQueue in Java? (answer)
 * A data structure that always keeps the highest or lowest element at the head so that you can
 * access or remove it in constant time
 */
public class PriorityQueueTest {


    //Needs comparable implementation in Student object
    static void naturalOrder(){
        Student s1 = new Student(3, "Amit");
        Student s2 = new Student(2, "Vikas");
        Student s3 = new Student(1, "Meenakashi");

        Queue<Student> studentQueue = new PriorityQueue<>();
        studentQueue.add(s1);
        studentQueue.add(s2);
        studentQueue.add(s3);

        while (!studentQueue.isEmpty()) {
            //poll will delete the element after reading the object
            //Peek can be used if don't want to remove the object
            System.out.println(studentQueue.poll());
        }
    }

    static void customOder(){
        Student s1 = new Student(3, "Amit");
        Student s2 = new Student(2, "Vikas");
        Student s3 = new Student(1, "Meenakashi");

        Comparator<Student> comparator = (v1, v2) -> Integer.compare(v1.getRollNumber(), v2.getRollNumber());

        Queue<Student> studentQueue = new PriorityQueue<>(comparator);
        studentQueue.add(s1);
        studentQueue.add(s2);
        studentQueue.add(s3);

        while ( ! studentQueue.isEmpty()) {
            //poll will delete the element after reading the object
            //Peek can be used if don't want to remove the object
            System.out.println(studentQueue.poll());

        }
    }
    public static void main(String[] args) {

        naturalOrder();

        //customOder();



    }

}
