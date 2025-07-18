package practice.udemy.linklist;

public class MainLinkList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(4);
        list.append(2);
        list.prepend(10);
        System.out.println(list.removeFirst().value);
        System.out.println(list.removeFirst().value);
        System.out.println(list.removeFirst().value);
        System.out.println(list.removeFirst());
        System.out.println("----------------------------------");
       list.printList();
    }

}
