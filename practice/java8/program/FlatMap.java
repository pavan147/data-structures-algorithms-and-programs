package practice.java8.program;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Java code for Stream flatMap
 * to flatten a stream of lists into a stream of elements
 * o/p :
 * Geeks
 * For
 * GeeksForGeeks
 * A computer portal
 * Java
 * Programming
 */
public class FlatMap {
    public static void main(String[] args) {
        // Creating a List of Lists
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Geeks", "For"),
                Arrays.asList("GeeksForGeeks", "A computer portal"),
                Arrays.asList("Java", "Programming")
        );

        listOfLists.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
