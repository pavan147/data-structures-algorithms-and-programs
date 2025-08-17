

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClassTst {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student("Sonali", List.of(42, 61, 62)),
                new Student("Namdev", List.of(41, 60, 61)),
                new Student("Rohit", List.of(35, 35, 36)));

//        Integer max = students.stream().map(student -> student.getMarks().stream().reduce(0, (integer, integer2) ->
//                integer + integer2)).max(Integer::compareTo).get();
//
//
//        List<Student> collect = students.stream().filter(student -> student.getMarks().stream().reduce(0, Integer::sum).equals(max))
//                .collect(Collectors.toList());


         Student max = students.stream().max(Comparator.comparing(std -> std.getMarks().stream().mapToInt(Integer::valueOf).sum())).orElse(null);
        System.out.println(max);
    }
}
