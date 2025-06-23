package practice.java8.program;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class SquareOfEvenNumber {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9};

        Predicate<Integer> evenNumber = integer -> integer % 2 == 0;

        Stream.of(arr).filter(evenNumber).map(integer -> integer * integer).forEach(integer -> {
            System.out.println(integer);
        });
    }
}
