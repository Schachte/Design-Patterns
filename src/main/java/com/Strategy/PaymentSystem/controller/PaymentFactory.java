package com.Strategy.PaymentSystem.controller;

public class PaymentFactory {
    public static Payment getPaymentMethod(String email, String password) {
        return new PaypalAlgo(email, password);
    }

    public static Payment getPaymentMethod(String name,  Double creditCardNumber) {
        return new CreditCardAlgo(name, creditCardNumber);
    }

    public static Payment getPaymentMethod(String bitCoinWallet) {
        return new BitcoinAlgo(bitCoinWallet);
    }
}
