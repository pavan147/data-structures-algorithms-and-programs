package practice.java8.program;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeOperations {
    public static void main(String[] args) {
        // Sample list of Employees
        List<Employee1> employeesList = Arrays.asList(
                new Employee1(1, "Alice", "HR", 60000),
                new Employee1(2, "Bob", "IT", 80000),
                new Employee1(3, "Charlie", "HR", 70000),
                new Employee1(4, "David", "IT", 90000),
                new Employee1(5, "Eve", "Finance", 75000),
                new Employee1(6, "Frank", "Finance", 65000),
                new Employee1(7, "Grace", "IT", 95000)
        );

        // Group by department
        Map<String, List<Employee1>> groupByDepartment = employeesList.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment()));

        // 1. Max/Min salary in each department
        Map<String, Double> minSalByDept = employeesList.stream().collect(Collectors.groupingBy(employee1 -> employee1.getDepartment()))
                .entrySet().stream().collect(Collectors.toMap(key -> key.getKey(), o -> o.getValue().stream().mapToDouble(value -> value.getSalary()).min().orElse(0)));

        Map<String, Double> maxSalaryByDept = employeesList.stream().collect(Collectors.groupingBy(employee1 -> employee1.getDepartment()))
                .entrySet().stream().collect(Collectors.toMap(key -> key.getKey(), o -> o.getValue().stream().mapToDouble(value -> value.getSalary()).min().orElse(0)));

        // 2. Sum of salaries in each department
        Map<String, Double> sumSalaryByDept = employeesList.stream().collect(Collectors.groupingBy(employee1 -> employee1.getDepartment()))
                .entrySet().stream().collect(Collectors.toMap(key -> key.getKey(), o -> o.getValue().stream().mapToDouble(value -> value.getSalary()).sum()));


        // 3. Print all Employee1s belonging to a department
        System.out.println("Employees grouped by department:");
        groupByDepartment.entrySet().forEach((entry -> {
            System.out.println("Department " + entry.getKey());
            entry.getValue().forEach(employee1 -> {
                System.out.println(employee1);
            });
        }));

        // 4. Count number of Employee1s belonging to each department
        Map<String, Long> countByDept = employeesList.stream().collect(Collectors.groupingBy(employee1 -> employee1.getDepartment(), Collectors.counting()));

        // Output results
        System.out.println("Group by Department " + groupByDepartment);
        System.out.println("\nMax Salary by Department: " + maxSalaryByDept);
        System.out.println("Min Salary by Department: " + minSalByDept);
        System.out.println("Sum of Salaries by Department: " + sumSalaryByDept);
        System.out.println("Employee1 Count by Department: " + countByDept);
    }
}
