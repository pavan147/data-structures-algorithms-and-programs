package practice.udemy.linklist;

public class MainLinkList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(4);
        list.append(2);
        System.out.println(list.removeLast().value);
        System.out.println(list.removeLast().value);
        System.out.println(list.removeLast());
       list.printList();
    }

}
