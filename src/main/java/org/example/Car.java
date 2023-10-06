package org.example;

public class Car extends Vehicle implements Driveable{

    private int numberOfDoors;
    private final float EXTRA_TAX = .05f;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public float getEXTRA_TAX() {
        return EXTRA_TAX;
    }

    public void printNumberOfDoors(int numberOfDoors){

    }

    @Override
    public void printVehicleType() {

    }

    @Override
    public float getPriceAfterTax() {
        return 0;
    }

    public Car(String name) {
        super(name);
    }

    @Override
    public void printSpeed() {

    }
}
