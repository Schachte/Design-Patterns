package com.Strategy.PaymentSystem.model;

/**
 * This class just represents the way we are going to structure our basic products regardless of strategy used to pay
 */
public class Product {
    private String upcCode;
    private int price;

    public Product(String upcCode, int price) {
        this.upcCode = upcCode;
        this.price = price;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
