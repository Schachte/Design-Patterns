package com.Strategy.CarSystem;

public class Main {
    public static void main(String[] args) throws Exception {

        ICar myCar = CarFactory.getCar(new OldCarImpl());
        myCar.start();

    }
}
