package practice.udemy.linklist;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainLinkList {

    public static void main(String[] args) {

        Queue queue = new Queue(7);
        queue.enQueue(8);

        queue.printQueue();
        System.out.println("-----------------");
        queue.dequeue();


        queue.printQueue();


    }



}
