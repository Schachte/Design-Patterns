package com.Strategy.CarSystem;

public class OldCarImpl implements ICar{
    @Override
    public void start() {
        System.out.println("Sticking key into ignition to start the car!");
    }
}
