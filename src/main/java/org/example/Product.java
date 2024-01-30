package org.example;

public class Product {
    private String name;
    private int price;
    private int rating;

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Товар{" +
                "Имя:'" + name + '\'' +
                ", Цена:" + price +
                ", Рейтинг:" + rating +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setReit(int reit) {
        this.rating = reit;
    }
}
