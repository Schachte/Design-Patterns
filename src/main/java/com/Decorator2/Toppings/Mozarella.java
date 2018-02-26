package com.Decorator2.Toppings;

import com.Decorator2.Interfaces.Pizza;

public class Mozarella extends ToppingDecorator {
    public Mozarella(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Moz");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozarella";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + .50;
    }
}
