package practice.java8.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FaltMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>();

        // Adding lists to the main list
        listOfLists.add(new ArrayList<>(List.of("Apple", "Banana", "Cherry")));
        listOfLists.add(new ArrayList<>(List.of("Red", "Green", "Blue")));
        listOfLists.add(new ArrayList<>(List.of("One", "Two", "Three")));

        List<String> collect = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(listOfLists);
        System.out.println(collect);
    }
}
