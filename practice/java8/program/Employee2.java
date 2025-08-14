package practice.java8.program;

public class Employee2 {
  private int empId;
  private String name;
  private int age;
  private String dept;
  private Double salary;
  private String gender;

  public Employee2() {}

  public Employee2(int empId, String name, int age, String dept, Double salary) {
    this.empId = empId;
    this.name = name;
    this.age = age;
    this.dept = dept;
    this.salary = salary;
  }

  public Employee2(int empId, String name, int age, String dept, Double salary, String gender) {
    this.empId = empId;
    this.name = name;
    this.age = age;
    this.dept = dept;
    this.salary = salary;
    this.gender = gender;
  }

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Employee{"
        + "empId="
        + empId
        + ", name='"
        + name
        + '\''
        + ", age="
        + age
        + ", dept='"
        + dept
        + '\''
        + ", salary="
        + salary
        + ", gender='"
        + gender
        + '\''
        + '}'
        + "\n";
  }
}
 