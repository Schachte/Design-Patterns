package com.Decorator2.Toppings;

import com.Decorator2.Interfaces.Pizza;

public class TomatoSauce extends ToppingDecorator{
    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding sauce");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", sauce";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 1.0;
    }
}
