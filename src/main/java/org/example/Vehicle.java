package org.example;

public abstract class Vehicle extends Product{

    private int speed;
    private float price;

   protected final float TAX_AMT = .10f;

    public abstract void printVehicleType();

public  abstract float getPriceAfterTax();


    public Vehicle(String name, int speed, float price) {
        super(name);
        this.speed = speed;
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getTAX_AMT() {
        return TAX_AMT;
    }

    public Vehicle(String name) {
        super(name);
    }




}
