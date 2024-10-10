package practice.java8.program;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {

        return salary;
    }

    public String getName() {
        return name;
    }
}

class Main1 {

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 30, 60000),
                new Employee("Bob", 35, 75000),
                new Employee("Charlie", 28, 50000),
                new Employee("David", 40, 80000),
                new Employee("Eva", 35, 55000)
        );
        processEmployeeData(employees);
    }

    public static void processEmployeeData(List<Employee> employees) {
        // Task 1: Find the average age of all employees.
        double average = employees.stream().mapToInt(Employee::getAge).average().getAsDouble();
        System.out.println("Average Age" + average);


        // Task 2: Extract the names of employees whose salary is above a certain threshold
        double salaryThreshold = 50000;
        List<Employee> collect = employees.stream().filter(employee -> employee.getSalary() > salaryThreshold).collect(Collectors.toList());
        System.out.println("employees whose salary is above a certain threshold " + collect);

        // Task 3: Group employees by their age.
        Map<Integer, List<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
        System.out.println("Group employees by their age"+collect1);


        // Task 4: Calculate the total salary of all employees.
        double sum = employees.stream().mapToDouble(Employee::getSalary).sum();

        System.out.println("Calculate the total salary of all employees."+sum);

    }
}