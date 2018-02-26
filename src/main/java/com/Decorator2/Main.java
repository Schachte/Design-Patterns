package com.Decorator2;

import com.Decorator2.Impls.PlainPizza;
import com.Decorator2.Interfaces.Pizza;
import com.Decorator2.Toppings.Mozarella;
import com.Decorator2.Toppings.TomatoSauce;

public class Main {
    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(new Mozarella(new PlainPizza()));
        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getCost());
    }
}
