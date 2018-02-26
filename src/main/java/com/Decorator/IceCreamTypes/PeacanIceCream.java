package com.Decorator.IceCreamTypes;

import com.Decorator.impls.IceCreamDecorator;
import com.Decorator.interfaces.IceCream;

public class PeacanIceCream extends IceCreamDecorator{
    public PeacanIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding pecan icecream!");
        return 3 + super.cost();
    }
}
