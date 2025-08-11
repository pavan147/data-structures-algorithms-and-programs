package practice.udemy.linklist;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
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
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        Node temp = head;
        Node pre = head;

        if (length == 0) {
            return null;
        }
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index > length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {

        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
        }
        if (index == length) {
            append(value);
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);

        newNode.next = temp.next;
        temp.next = newNode;
        length++;
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

        Node prev = get(index - 1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    /**
     * Step1: first swap the head and tail
     * Step2
     */
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
  /*
  Implement a method called findMiddleNode that returns the middle node of the linked list.

If the list has an even number of nodes, the method should return the second middle node.

Note: this LinkedList implementation does not have a length member variable.


Method signature:

public Node findMiddleNode()




Example:

LinkedList myList = new LinkedList(1);
myList.append(2);
myList.append(3);
myList.append(4);
myList.append(5);
Node middleNode = myList.findMiddleNode();
System.out.println(middleNode.value); // Output: 3

myList.append(6);
middleNode = myList.findMiddleNode();
System.out.println(middleNode.value); // Output: 4


When the linked list has an odd number of nodes, like 1 -> 2 -> 3 -> 4 -> 5, the function will find the exact middle node. In this case, it will return the node containing the value 3.

When the linked list has an even number of nodes, there will be two middle nodes. The findMiddleNode function will return the second of these two middle nodes.

For example, if the linked list is 1 -> 2 -> 3 -> 4 -> 5 -> 6, the two middle nodes are 3 and 4. The function will return the node containing the value 4.


   */
    public Node findMiddleNode() {

        Node slow = head;
        Node fast = head;
        int count = 0;
        while (fast != null) {
            count++;
            if (count == 2) {
                slow = slow.next;
                count = 0;
            }
            fast = fast.next;
        }
        return slow;

    }

    /**
     LL: Has Loop ( ** Interview Question)
     Write a method called hasLoop that is part of the linked list class.

     The method should be able to detect if there is a cycle or loop present in the linked list.

     You are required to use Floyd's cycle-finding algorithm (also known as the "tortoise and the hare" algorithm) to detect the loop.

     This algorithm uses two pointers: a slow pointer and a fast pointer. The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. If there is a loop in the linked list, the two pointers will eventually meet at some point. If there is no loop, the fast pointer will reach the end of the list.

     The method should follow these guidelines:



     Create two pointers, slow and fast, both initially pointing to the head of the linked list.

     Traverse the list with the slow pointer moving one step at a time, while the fast pointer moves two steps at a time.

     If there is a loop in the list, the fast pointer will eventually meet the slow pointer. If this occurs, the method should return true.

     If the fast pointer reaches the end of the list or encounters a null value, it means there is no loop in the list. In this case, the method should return false.



     Output:

     Return true if the linked list has a loop.

     Return false if the linked list does not have a loop.



     Constraints:

     You are not allowed to use any additional data structures (such as arrays) or modify the existing data structure.

     You can only traverse the linked list once.


     Method signature:

     public boolean hasLoop()
     * @return
     */
    public boolean hasLoop() {

        Node slow = head;
        Node fast = head;
        int count = 0;
        while (fast != null) {
            count++;
            if (count == 2) {
                slow = slow.next;
                count = 0;
            }
            fast = fast.next;
            if(slow == fast){
                return true;
            }

        }
        return false;

    }


}
