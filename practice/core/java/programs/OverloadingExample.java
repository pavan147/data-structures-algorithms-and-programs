package practice.core.java.programs;

public class OverloadingExample {
    public void method(String str) {
        System.out.println("String method called");
    }

    public void method(StringBuilder sb) {
        System.out.println("StringBuilder method called");
    }

    public void method(Object obj) {
        System.out.println("Object method called");
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
       // example.method(null); // Compiler error!
    }
}