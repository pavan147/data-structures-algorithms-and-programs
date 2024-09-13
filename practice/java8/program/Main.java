package practice.java8.program;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Java class Trainer with fields as id and name, another class Person with fields as id,name
 * and Trainer we meed to get the names of trainer
 * who are training maximum persons.
 */
class Trainer {
    private int id;
    private String name;

    public Trainer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Trainer trainer = (Trainer) o;
//        return id == trainer.id && Objects.equals(name, trainer.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
}

class Person {
    private int id;
    private String name;
    private Trainer trainer;

    public Person(int id, String name, Trainer trainer) {
        this.id = id;
        this.name = name;
        this.trainer = trainer;
    }

    public Trainer getTrainer() {
        return trainer;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create trainers
        Trainer trainer1 = new Trainer(1, "John");
        Trainer trainer2 = new Trainer(2, "Jane");
        Trainer trainer3 = new Trainer(3, "Alice");

        // Create persons with associated trainers
        List<Person> persons = Arrays.asList(
                new Person(1, "Person1", trainer1),
                new Person(2, "Person2", trainer1),
                new Person(3, "Person3", trainer2),
                new Person(4, "Person4", trainer3),
                new Person(5, "Person5", trainer1),
                new Person(6, "Person6", trainer2)
        );
        List<String> collect = persons.stream().collect(Collectors.groupingBy(person -> person.getTrainer()))
                .entrySet().stream()
                .max(Comparator.comparing(trainerListEntry -> trainerListEntry.getValue().size()))
                .stream().map(trainerListEntry -> trainerListEntry.getKey().getName())
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
