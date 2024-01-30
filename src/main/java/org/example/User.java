package org.example;

import java.util.ArrayList;

public class User {
    protected String login;
    protected String password;
    protected Basket userBasket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        Basket bask = new Basket();
        userBasket = bask;
    }

    public User() {
    }

    public String getName() {
        return login;
    }

    @Override
    public String toString() {
        return "Пользователь {" +
                "Логин: '" + login + '\'' +
                ", Пароль:'" + password + '\'' +
                '}';
    }

    public ArrayList<Product> getBasket() {
        return userBasket.getProdList();
    }

    public void buySome(Product product, Shop mag) {
        userBasket.addToBasket(product);
        mag.removeFromColl(product);
    }
}
