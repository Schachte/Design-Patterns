package com.Strategy.CarSystem;

public class CarFactory {

    public static ICar getCar(ICar type) throws Exception {
        if (type instanceof NewCarImpl) {
            return new NewCarImpl();
        }
        else if (type instanceof  OldCarImpl) {
            return new OldCarImpl();
        }
        else {
            throw new Exception("Unhandled car type");
        }
    }
}
