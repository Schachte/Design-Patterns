package com.Decorator3.parts;

import com.Decorator3.interfaces.Computer;

public class CPUPart extends PartDecorator{

    public CPUPart(Computer tempComputer) {
        super(tempComputer);
    }

    @Override
    public String getParts() {
        return super.getParts() + ", CPU";
    }

    @Override
    public double getTotalCost() {
        return super.getTotalCost() + 350.00;
    }
}
