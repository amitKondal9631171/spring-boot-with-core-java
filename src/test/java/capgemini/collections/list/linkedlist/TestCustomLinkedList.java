package capgemini.collections.list.linkedlist;

public class TestCustomLinkedList {

    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        list.printListRecursively();
        //list.printListRecursively(list);
    }
}
