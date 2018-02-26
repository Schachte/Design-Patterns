package com.Strategy.PaymentSystem.controller;

public class CreditCardAlgo implements Payment {
    private String name;
    private Double cardNumber;

    public CreditCardAlgo(String name, double cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with Card!");
    }
}
