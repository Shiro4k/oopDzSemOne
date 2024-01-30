package org.example;

import java.util.ArrayList;

public class Shop {
    private String ShopName;
    private ArrayList<Product> ShopList;

    public Shop(String shopName) {
        this.ShopName = shopName;
        this.ShopList = new ArrayList<>();
    }

    public void addToColl(Product product) {
        this.ShopList.add(product);
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        this.ShopName = shopName;
    }

    public ArrayList<Product> getShopList() {
        return ShopList;
    }

    public void removeFromColl(Product product) {
        this.ShopList.remove(product);
    }
}