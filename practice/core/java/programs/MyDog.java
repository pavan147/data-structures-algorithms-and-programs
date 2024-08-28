package practice.core.java.programs;

public class MyDog extends  Dog{
    String myDog;
    public MyDog(String name, String breed , String myDog) {
        super(name, breed);
        this.myDog =myDog;
    }

    @Override
    public String toString() {
        return "MyDog{" +
                "myDog='" + myDog + '\'' +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
