package org.example;

import java.util.ArrayList;

public class Main {
    public static void printMassive(ArrayList<Product> array) {
        for (Product item : array) {
            System.out.println(item.toString());
        }
        System.out.println("---");
    }

    public static void main(String[] args) {
        Shop shop = new Shop("Пяторочка");
        Product Beans = new Product("Бобы", 250, 8);
        shop.addToColl(Beans);
        Product Beef = new Product("Говядина", 85, 5);
        shop.addToColl(Beef);
        Product Pants = new Product("Трико", 2500, 2);
        shop.addToColl(Pants);
        Product Shirt = new Product("Футболка", 1500, 3);
        shop.addToColl(Shirt);
        Category Clothes = new Category("Одежда");
        Clothes.addToColl(Pants);
        Clothes.addToColl(Shirt);
        Category Goods = new Category("Товары");
        Goods.addToColl(Beef);
        Goods.addToColl(Beans);
        User Dima = new User("dima", "123");
        User Masha = new User("masha", "321");
        System.out.println("Товары Магазина");
        ArrayList<Product> product = shop.getShopList();
        printMassive(product);

        System.out.println("Покупка Димы");
        Dima.buySome(Beef, shop);
        ArrayList<Product> DimaShopList = Dima.getBasket();
        printMassive(DimaShopList);

        System.out.println("Покупка Маши");
        Masha.buySome(Beans, shop);
        ArrayList<Product> MashaShopList = Masha.getBasket();
        printMassive(MashaShopList);

        System.out.println("Товары Магазина");
        ArrayList<Product> products2 = shop.getShopList();
        printMassive(products2);

    }
}