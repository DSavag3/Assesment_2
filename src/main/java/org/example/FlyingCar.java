package org.example;

public class FlyingCar extends Vehicle implements Flyable, Driveable{

    @Override
    public void printVehicleType() {

    }

    @Override
    public float getPriceAfterTax() {
        return 0;
    }

    public FlyingCar(String name) {
        super(name);
    }

    @Override
    public boolean transportsPassengers() {
        return false;
    }

    @Override
    public void printSpeed() {

    }
}
