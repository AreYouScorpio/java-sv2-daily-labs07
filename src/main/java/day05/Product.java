package day05;

import java.time.LocalDate;

public class Product {
    String name;
    LocalDate sellingDate;
    int price;

    public Product(String name, LocalDate sellingDate, int price) {
        this.name = name;
        this.sellingDate = sellingDate;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public LocalDate getSellingDate() {
        return sellingDate;
    }

    public int getPrice() {
        return price;
    }
}
