package com.pluralsight;

public class Car extends Vehicle {

    private String truckContents;
    private String airFreshenerType;

    public String getTruckContents() {
        return truckContents;
    }

    public void setTruckContents(String truckContents) {
        this.truckContents = truckContents;
    }

    public String getAirFreshenerType() {
        return airFreshenerType;
    }

    public void setAirFreshenerType(String airFreshenerType) {
        this.airFreshenerType = airFreshenerType;
    }
}
