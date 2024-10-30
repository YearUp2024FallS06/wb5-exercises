package com.pluralsight;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        Asset a1 = new Asset("Golden Necklace", "2004", 200);

        assets.add(a1);

      //  House h1 = new House();
      //  House h2 = new House();
      //  Vehicle v1 = new Vehicle();
      //  Vehicle v2 = new Vehicle();

        for(Asset a : assets){
            System.out.println(a.getDescription() + " Acquired on " + a.getDateAcquired() + " for " + a.getOriginalCost() + " is now worth: " + a.getValue());
        }
    }


}