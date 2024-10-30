package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Hovercraft vehicle1 = new Hovercraft();
        vehicle1.setElectric(true);
        vehicle1.setNumberOfPassengers(6);
        vehicle1.setHoverHeight(2f);

        SemiTruck vehicle2 = new SemiTruck();
        vehicle2.setElectric(false);
        vehicle2.setGasoline(true);
        vehicle2.setHasTrailer(true);



        System.out.println(vehicle1);
        System.out.println(vehicle2);
    }
}