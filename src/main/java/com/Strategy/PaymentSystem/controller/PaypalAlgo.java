package com.Strategy.PaymentSystem.controller;

public class PaypalAlgo implements Payment {

    private String email;
    private String password;

    public PaypalAlgo(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        double totalAmt = computePaypalFee(amount);
        System.out.println(totalAmt + " paid with Paypal!");
    }

    private double computePaypalFee(int amount) {
        return amount + (amount * .03);
    }
}
