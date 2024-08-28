package practice.core.java.programs;

public class Employee {

    public Employee(String name, Integer employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    private Integer employeeId;
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
