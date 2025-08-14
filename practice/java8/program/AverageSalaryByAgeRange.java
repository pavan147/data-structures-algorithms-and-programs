package practice.java8.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee4 {
    private String name;
    private int age;
    private double salary;

    public Employee4(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + '}';
    }
}

public class AverageSalaryByAgeRange {
    public static void main(String[] args) {
        // List of employees
        List<Employee4> employees = Arrays.asList(
                new Employee4("Alice", 22, 25000),
                new Employee4("Bob", 30, 30000),
                new Employee4("Charlie", 24, 28000),
                new Employee4("David", 20, 26000),
                new Employee4("Eve", 28, 32000),
                new Employee4("Frank", 23, 27000)
        );

        // Define age range
        int ageMin = 18;
        int ageMax = 25;

        // Calculate average salary for employees in the age range (18-25)
        double averageSalary = employees.stream()
                .filter(employee -> employee.getAge() >= ageMin && employee.getAge() <= ageMax)  // Filter by age range
                .collect(Collectors.averagingDouble(value -> value.getSalary()));                        // Calculate average salary

        System.out.println("The average salary of employees aged " + ageMin + "-" + ageMax + " is: " + averageSalary);
    }
}