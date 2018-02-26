package com.Decorator3.parts;

import com.Decorator3.interfaces.Computer;

public class GPUPart extends PartDecorator{

    public GPUPart(Computer tempComputer) {
        super(tempComputer);
    }

    @Override
    public String getParts() {
        return super.getParts() + ", GPU";
    }

    @Override
    public double getTotalCost() {
        return super.getTotalCost() + 545.00;
    }
}
