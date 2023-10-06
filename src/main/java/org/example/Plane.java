package org.example;

public class Plane extends  Vehicle implements Flyable{
    @Override
    public void printVehicleType() {

    }

    @Override
    public float getPriceAfterTax() {
        return 0;
    }

    public Plane(String name) {
        super(name);
    }

    @Override
    public boolean transportsPassengers() {
        return false;
    }
}
