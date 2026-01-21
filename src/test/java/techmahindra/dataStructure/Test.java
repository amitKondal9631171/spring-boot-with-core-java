package techmahindra.dataStructure;

/**
 * Created by HP-USER on 26-06-2019.
 */
public class Test {
    static Node head;
    static class Node{
        int a;
        Node next;

        Node(int value){
            this.a = value;
                    next = null;
        }
    }

    static void displayNods(){
        Node n = head;
        while (n != null){
            System.out.println(n.a);
            n=n.next;
        }
    }

    public static void main(String[] args) {

        head = new Node(10);
        Node second = new Node(20);
        Node tail = new Node(30);

        head.next=second;
        head.next.next=tail;
        displayNods();

    }
}
