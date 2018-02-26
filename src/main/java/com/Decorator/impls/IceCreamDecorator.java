package com.Decorator.impls;

import com.Decorator.interfaces.IceCream;

public class IceCreamDecorator implements IceCream{
    private IceCream iceCream;
    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public double cost() {
        return this.iceCream.cost();
    }
}
