package practice.core.java.programs;

import java.util.HashMap;

public class EmployeeHashMapExample {
    public static void main(String[] args) {
        HashMap<Employee,String>  hashMap = new HashMap<>();

        Employee employee = new Employee("Namdev", 123);

        hashMap.put(employee,"Namdev");
        employee = new Employee("Namdev",123);

        System.out.println(hashMap.get(employee));



    }
}
