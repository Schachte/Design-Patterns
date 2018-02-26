package com.Strategy.PaymentSystem.controller;

public class BitcoinAlgo implements Payment {

    private String walletAddress;

    public BitcoinAlgo(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(int amount) {
        System.out.println(usdToBitcoin(amount) + " paid in bitcoin!");
    }

    private double usdToBitcoin(double usd) {
        // Random conversion to pretend btc converter
        return usd/(usd + 120);
    }
}
