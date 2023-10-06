package org.example;

public class Truck extends Vehicle implements Driveable{
    @Override
    public void printVehicleType() {

    }

    @Override
    public float getPriceAfterTax() {
        return 0;
    }

    public Truck(String name) {
        super(name);
    }

    @Override
    public void printSpeed() {

    }
}
