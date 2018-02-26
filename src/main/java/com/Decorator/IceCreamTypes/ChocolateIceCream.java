package com.Decorator.IceCreamTypes;

import com.Decorator.impls.IceCreamDecorator;
import com.Decorator.interfaces.IceCream;

public class ChocolateIceCream extends IceCreamDecorator{
    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding chocolate icecream!");
        return 1.50 + super.cost();
    }
}
