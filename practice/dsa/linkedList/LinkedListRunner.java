package practice.dsa.linkedList;

public class LinkedListRunner {
    public static void main(String[] args) {
        SingalLinkedList list = new SingalLinkedList();
        list.insert(23);
        list.insert(54);
        //           (2,99);
        list.insert(78);
        list.insert(28);
        list.insertAtFirst(1);


        list.insertAt(2,99);
        list.delete(2);

        list.show();

    }
}
