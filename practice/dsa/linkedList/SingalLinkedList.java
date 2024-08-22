package practice.dsa.linkedList;

public class SingalLinkedList {
    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {

            Node travelsNode = head;
            while (travelsNode.next != null) {
                travelsNode = travelsNode.next;
            }
            travelsNode.next = node;
        }

    }

    public void show() {
        Node node = head;
        while (node.next != null) {

            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertAtFirst(int data) {

        Node node = new Node();
        node.data = data;
        node.next = head;

        head = node;
    }

    public void insertAt(int index, int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;
        if (index == 0) {
            insertAtFirst(data);
        }
        Node travelNode = head;
        for (int i = 0; i < index - 1; i++) {

            travelNode = travelNode.next;
        }
        node.next = travelNode.next;
        travelNode.next = node;
    }

    public void delete(int index) {
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
    }

}
