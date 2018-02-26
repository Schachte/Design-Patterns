package com.Decorator.IceCreamTypes;

import com.Decorator.impls.IceCreamDecorator;
import com.Decorator.interfaces.IceCream;

public class VanillaIceCream extends IceCreamDecorator{
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding vanilla icecream!");
        return 2 + super.cost();
    }
}
