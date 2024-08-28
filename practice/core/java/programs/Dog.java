package practice.core.java.programs;

import java.beans.Transient;
import java.io.Serializable;

public class Dog implements Serializable {
    transient  String  name;
     String breed;

    public Dog(String name , String breed) {
        this.name = name;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
