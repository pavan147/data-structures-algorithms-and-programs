package practice.core.java.programs;

/**
 * Two overloading method, one has Object as Parameter and other has String. Call method by passing null, which method will going to call, object one or String one.   in java
 *
 * Ans :
 *  This happens because String is a more specific type compared to Object, and Java chooses the most specific method available.
 */
public class OverloadExample {
    public void print(Object obj) {
        System.out.println("Object method called");
    }

    public void print(String str) {
        System.out.println("String method called");
    }

    public static void main(String[] args) {
        OverloadExample example = new OverloadExample();
        example.print(null); // This will call the String method
    }
}
