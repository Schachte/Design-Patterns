package com.Decorator3.impl;

import com.Decorator3.interfaces.Computer;

public class BasicComputer implements Computer{
    @Override
    public String getParts() {
        return "Standard computer case";
    }

    @Override
    public double getTotalCost() {
        return 50.00;
    }
}
