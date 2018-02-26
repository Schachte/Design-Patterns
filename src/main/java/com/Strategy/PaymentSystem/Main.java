package com.Strategy.PaymentSystem;

import com.Strategy.PaymentSystem.controller.PaymentFactory;
import com.Strategy.PaymentSystem.controller.ShoppingCart;
import com.Strategy.PaymentSystem.model.Product;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product macbook = new Product("542", 1450);
        Product monitor = new Product("695", 850);

        cart.addProduct(macbook);
        cart.addProduct(monitor);

        // Payment Decisions
        cart.pay(PaymentFactory.getPaymentMethod("ryan@gmail.com", "password123"));
        cart.pay(PaymentFactory.getPaymentMethod("Ryan S", (double) 12949124));
        cart.pay(PaymentFactory.getPaymentMethod("ABDFI3R93434NEFKEFEOF"));

    }
}
