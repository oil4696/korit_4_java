package ch19_generic.product;

public class ProductController {
    public static void main(String[] args) {
        Product<String> product1 = new Product("Laptop", "Intel i7 16GB RAM 512GB SSD");
        Product<Double> product2 = new Product("smartphone","");
    }
}

