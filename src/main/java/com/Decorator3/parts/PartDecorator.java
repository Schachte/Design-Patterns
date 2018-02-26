package com.Decorator3.parts;

import com.Decorator3.interfaces.Computer;

public class PartDecorator implements Computer {
    protected Computer tempComputer;

    public PartDecorator(Computer tempComputer) {
        this.tempComputer = tempComputer;
    }

    @Override
    public String getParts() {
        return this.tempComputer.getParts();
    }

    @Override
    public double getTotalCost() {
        return this.tempComputer.getTotalCost();
    }
}
