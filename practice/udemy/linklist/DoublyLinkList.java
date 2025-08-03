package practice.udemy.linklist;

public class DoublyLinkList {
    private Node head;
    private Node tail;
    int length;

    class Node {
        int value;
        Node next;
        Node prev;
        Node tail;

        Node(int value) {
            this.value = value;
        }
    }

    DoublyLinkList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void getHead() {
        System.out.println("Head :" + head.value);
    }

    public void getTail() {
        System.out.println("Head :" + tail.value);
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {

            tail.next = newNode;
            tail.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {

            head = head.next;
            head.prev = null;

        }
        length--;
        return temp;
    }

    // This code is same as single link list. but efficient code is as second get method
    public Node get1(int index) {
        if (index < 0 || index > length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    //Need to check this logic.
//    public Node get(int index) {
//        if (index < 0 || index >= length) return null;
//        Node temp = head;
//        if (index < length / 2) {
//            for (int i = 0; i < index; i++) {
//                temp = temp.next;
//            }
//        } else {
//            temp = tail;
//            for (int i = length - 1; i > index; i--) {
//                temp = temp.prev;
//            }
//        }
//        return temp;
//    }

    public boolean set(int index, int value) {
        Node temp = get1(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        Node newNode = new Node(value);
        Node before = get1(index - 1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;

        before.next = newNode;
        after.prev = newNode;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }

        Node temp = get1(index);

        Node after = temp.next;
        Node before = temp.prev;

        after.prev = before;
        before.next = after;
        length--;
        return temp;
    }


}
