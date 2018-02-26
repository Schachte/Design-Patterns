package com.Decorator2.Impls;

import com.Decorator2.Interfaces.Pizza;

public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
