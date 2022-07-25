package MapsLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Orders {
    static class Product {
        String name;
        double price;
        double quality;

        public Product(String name, double price, double quality) {
            this.name = name;
            this.price = price;
            this.quality = quality;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getQuality() {
            return quality;
        }

        public void setQuality(double quality) {
            this.quality = quality;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        Map<String, Product> products = new LinkedHashMap<>();
        while (!line.equals("buy")) {
            String[] data = line.split("\\s+");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            double quality = Double.parseDouble(data[2]);

            if (products.containsKey(name)) {
                products.get(name).setPrice(price);
                products.get(name).setQuality(products.get(name).getQuality() + quality);
            } else {
                products.put(name, new Product(name, price, quality));
            }

            line = scanner.nextLine();
        }

        products.forEach((k, v) -> System.out.printf("%s -> %.2f%n", k, v.getPrice() * v.getQuality()));
    }
}
