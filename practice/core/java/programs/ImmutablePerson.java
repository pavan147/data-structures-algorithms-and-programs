package practice.core.java.programs;
//final to prevent inheritance.
public final class ImmutablePerson {
    //All fields are declared as private and final not to modify and update
    private final String name;
    private final int age;

    //All fields are initialized in the constructor.
    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //There are no setter methods.

    //Only getter methods are provided, which return the field values.
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}