package com.Decorator3.parts;

import com.Decorator3.interfaces.Computer;

public class MotherboardPart extends PartDecorator {
    public MotherboardPart(Computer tempComputer) {
        super(tempComputer);
    }

    @Override
    public String getParts() {
        return super.getParts() + ", motherboard";
    }

    @Override
    public double getTotalCost() {
        return super.getTotalCost() + 245.00;
    }
}
