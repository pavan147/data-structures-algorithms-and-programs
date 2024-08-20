package practice.design.pattern.builder;

public class Product {
    private final String part1;
    private final String part2;
    private final String part3;

    private Product(Builder builder) {
        this.part1 = builder.part1;
        this.part2 = builder.part2;
        this.part3 = builder.part3;
    }

    @Override
    public String toString() {
        return "Product [part1=" + part1 + ", part2=" + part2 + ", part3=" + part3 + "]";
    }

    // Static nested Builder class
    public static class Builder {
        private String part1;
        private String part2;
        private String part3;

        public Builder setPart1(String part1) {
            this.part1 = part1;
            return this;
        }

        public Builder setPart2(String part2) {
            this.part2 = part2;
            return this;
        }

        public Builder setPart3(String part3) {
            this.part3 = part3;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
