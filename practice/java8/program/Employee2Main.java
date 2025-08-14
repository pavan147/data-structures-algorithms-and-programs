package practice.java8.program;

import practice.udemy.linklist.LinkedList;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee2Main {
  public static void main(String[] args) {
   // Department max salary
    Map<String, Optional<Double>> collect1 = getEmployees().stream().collect(Collectors.groupingBy(Employee2::getDept, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee2::getSalary)), employee2 -> employee2.map(Employee2::getSalary))));

    // Department max salary
    Map<String, Double> collect = getEmployees().stream().collect(Collectors.groupingBy(Employee2::getDept))
            .entrySet()
            .stream()
            .collect(Collectors.toMap(Map.Entry::getKey,
                    stringListEntry -> stringListEntry.getValue().stream().mapToDouble(Employee2::getSalary).max().getAsDouble()));

    //

    Map<String, List<String>> collect2 = getEmployees().stream().collect(Collectors.groupingBy(Employee2::getDept, Collectors.mapping(Employee2::getName, Collectors.toList())));

    List<Employee2> list = getEmployees().stream().sorted(Comparator.comparing(Employee2::getDept).thenComparing(Employee2::getSalary, Comparator.reverseOrder()))
            .toList();
 // Group by department then again group by gender
    Map<String, Map<String, List<Employee2>>> collect3 = getEmployees().stream().collect(Collectors.groupingBy(Employee2::getDept, Collectors.groupingBy(Employee2::getGender)));


    System.out.println(collect3);
  }

  // create test data
  private static List<Employee2> getEmployees() {
    List<Employee2> list = new ArrayList<>();
    list.add(new Employee2(101, "Abhijit", 32, "DEVELOPER", 90000.0, "Male"));
    list.add(new Employee2(102, "Namdev", 28, "DEVELOPER", 80000.0, "Male"));
    list.add(new Employee2(103, "Kalyan", 25, "TESTER", 85000.0, "Male"));
    list.add(new Employee2(104, "Rani", 36, "TESTER", 92000.0, "Female"));
    list.add(new Employee2(105, "Pooja", 34, "HR", 91000.0, "Female"));
    list.add(new Employee2(106, "Vikas", 24, "DEVELOPER", 88000.0, "Male"));
    list.add(new Employee2(107, "Kishor", 29, "DEVELOPER", 72000.0, "Male"));
    list.add(new Employee2(108, "Kiran", 27, "HR", 74000.0, "Male"));
    list.add(new Employee2(109, "Sonali", 35, "TESTER", 1780000.0, "Female"));
    return list;
  }
}
 