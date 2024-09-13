package practice.design.pattern.builder;

/**
 * By using the Builder Pattern,
 * you can avoid issues related to constructor overloading,
 * improve code readability, and achieve better encapsulation and immutability.
 */
public class BuilderMain {

    public static void main(String[] args) {
        // Create a Product using the Builder
        Product product = new Product.Builder()
                .setPart1("Part1")
                .setPart2("Part2")
                .build();




        System.out.println(product);
    }
}
