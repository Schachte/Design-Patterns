package com.Decorator3;

import com.Decorator3.impl.BasicComputer;
import com.Decorator3.interfaces.Computer;
import com.Decorator3.parts.CPUPart;
import com.Decorator3.parts.GPUPart;
import com.Decorator3.parts.MotherboardPart;

public class ComputerBuilder {
    public static void main(String[] args) {
        Computer myNewComputer = new MotherboardPart(new GPUPart(new CPUPart(new BasicComputer())));
        System.out.println("Total cost: " + myNewComputer.getTotalCost());
        System.out.println("Parts List: " + myNewComputer.getParts());
    }
}
