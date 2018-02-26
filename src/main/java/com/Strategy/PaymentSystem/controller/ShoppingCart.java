package com.Strategy.PaymentSystem.controller;

import com.Strategy.PaymentSystem.model.Product;

import java.util.ArrayList;
import java.util.List;

/*
The shopping cart class will help compute the totals, etc. The payment will be dynamically decided at runtime based
on the class type that implements the payment interface
 */
public class ShoppingCart {
    List<Product> productList;

    public ShoppingCart() {
        this.productList = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public int calculateTotal() {
        int sum = 0;

        for (Product product : productList) {
            sum+=product.getPrice();
        }

        return sum;
    }

    // The pay method is decided at runtime based on the type of Payment. (Paypal, Creditcard, etc).
    // This offers for easy extensibility since we can make unlimited number of payment sub class types
    public void pay(Payment paymentStrategy) {
        int amount = calculateTotal();
        paymentStrategy.pay(amount);
    }
}
