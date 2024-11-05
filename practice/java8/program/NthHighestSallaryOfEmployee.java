package practice.java8.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NthHighestSallaryOfEmployee {

    public static void main(String[] args) {
        List<Employee3> employees = Arrays.asList(
                new Employee3(1, "Sumit", 100),
                new Employee3(1, "Sumit2", 100),
                new Employee3(2, "Mujeeb", 200),
                new Employee3(3, "Ajay", 200),
                new Employee3(4, "Khan", 500),
                new Employee3(4, "Khan2", 500),
                new Employee3(4, "Khan2", 500)
        );


        Integer nthHighestSalary = 2;
        Integer limit = nthHighestSalary;
        Integer skip = nthHighestSalary - 1;

        List<Integer> collect1 = employees.stream().map(employee -> employee.getSalary()).distinct().sorted((o1, o2) -> -o1.compareTo(o2)).skip(skip).limit(limit)
                .collect(Collectors.toList());
        List<Employee3> collect = employees.stream()
                .filter(employee -> employee.getSalary().equals(collect1.get(0)))
                .collect(Collectors.toList());


        System.out.println(collect);
    }

}

class Employee3 {
    private Integer id;
    private String name;
    private int salary;

    public Employee3(int id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
