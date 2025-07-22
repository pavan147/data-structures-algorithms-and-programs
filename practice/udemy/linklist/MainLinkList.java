package practice.udemy.linklist;

public class MainLinkList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(4);
        list.append(2);
        list.prepend(10);

       list.printList();
        System.out.println("----------------------------------");
        System.out.println(list.get(0).value);
    }

}
