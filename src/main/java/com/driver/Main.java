package com.driver;

public class Main {
    public static class Product {
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

    public static void main(String[] args) {
        Product p = new Product();
        int x = p.product(1, 2);
        int y = p.product(1, 2, 3);
        double z = p.product(6.0, 2.0);
        System.out.println(x + " " + y + " " + z);
    }
}