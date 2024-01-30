package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Basket extends User {
    private int basketid;
    private ArrayList<Product> shopList;
    Random r = new Random();
    int id = r.nextInt(1, 150);

    public Basket() {
        basketid = id;
        this.shopList = new ArrayList<>();
    }

    public void addToBasket(Product product) {
        this.shopList.add(product);
    }

    public ArrayList<Product> getProdList() {
        return shopList;
    }

    public String getBasketid() {
        return "Your basket id " + basketid;
    }
}
