package com.Strategy.CarSystem;

public class NewCarImpl implements ICar {
    @Override
    public void start() {
        System.out.println("Pushing start button to start the engine!");
    }
}
