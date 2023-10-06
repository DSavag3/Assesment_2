package org.example;

public class Boat extends  Vehicle implements Driveable{

private boolean hasGPS;

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public static void printGpsInfo(Boat boat){
        boolean gpsInfo = boat.isHasGPS();
    }


    @Override
    public void printVehicleType() {

    }

    @Override
    public float getPriceAfterTax() {
        return 0;
    }

    public Boat(String name) {
        super(name);
    }

    @Override
    public void printSpeed() {

    }
}
