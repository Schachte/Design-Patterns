package com.Decorator.IceCreamTypes;

import com.Decorator.interfaces.IceCream;

public class BasicIceCream  implements IceCream{

    public BasicIceCream() {
        System.out.println("Creating a basic ice-cream!");
    }

    @Override
    public double cost() {
        return 0.50;
    }
}
