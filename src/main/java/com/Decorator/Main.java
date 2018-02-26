package com.Decorator;

import com.Decorator.IceCreamTypes.BasicIceCream;
import com.Decorator.IceCreamTypes.ChocolateIceCream;
import com.Decorator.IceCreamTypes.VanillaIceCream;
import com.Decorator.impls.IceCreamDecorator;
import com.Decorator.interfaces.IceCream;

public class Main {
    public static void main(String[] args) {
        IceCream basic = new BasicIceCream();
        System.out.println("Basic ice-cream is " + basic.cost());

        IceCream vanilla = new VanillaIceCream(basic);
        System.out.println("Vanilla ice-cream is " + vanilla.cost());

        IceCream chocolate = new ChocolateIceCream(vanilla);
        System.out.println("Chocolate ice-cream is " + chocolate.cost());

    }
}
