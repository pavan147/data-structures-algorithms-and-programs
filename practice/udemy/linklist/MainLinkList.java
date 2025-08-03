package practice.udemy.linklist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainLinkList {

    public static void main(String[] args) {
        DoublyLinkList list = new DoublyLinkList(2);

       list.append(4);
        list.append(5);
        list.prepend(1);

        list.insert(2,3);
        System.out.println("------------------------------------------");

        list.printList();

        list.remove(2);
        System.out.println("------------------------------------------");
        list.printList();


    }



}
