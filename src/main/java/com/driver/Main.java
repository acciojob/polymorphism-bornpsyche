package com.driver;

public class Main {
    Product p = new Product();
    int x = p.product(1, 2);
    int y = p.product(1, 2, 3);
    double z = p.product(1.0, 2.0);
}

class Product {
    int product(int x, int y) {
        return x * y;
    }

    int product(int x, int y, int z) {
        return x * y * z;
    }

    double product(double x, double y) {
        return x * y;
    }
}