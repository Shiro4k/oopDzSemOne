package org.example;

import java.util.ArrayList;

public class Category {
    private String categoryName;
    private ArrayList<Product> productList;

    public Category(String categoryName, ArrayList<Product> productList) {
        this.categoryName = categoryName;
        this.productList = productList;
    }

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.productList = new ArrayList<>();
    }

    public void addToColl(Product product) {
        this.productList.add(product);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ArrayList<Product> getProdList() {
        return productList;
    }
}
