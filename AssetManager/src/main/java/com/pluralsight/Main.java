package com.pluralsight;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();

        //Asset a1 = new Asset("Golden Necklace", "2004", 200);

        //assets.add(a1);

        House h1 = new House("My main house", "2001", 200000, "123 S Street.", 2, 1500, 40000);

        House h2 = new House("My vacation house", "2019", 150000, "567 N Street.", 3, 900, 15000);

        assets.add(h1);
        assets.add(h2);

        Vehicle v1 = new Vehicle("Daily Driver", "2011", 40000, "Jeep Liberty", 2011, 250000);
        Vehicle v2 = new Vehicle("Garage Classic", "2000", 15000, "Jeep CJ-8", 1981, 50000);

        assets.add(v1);
        assets.add(v2);

        double networth = 0;
        for(Asset a : assets){
            System.out.println(a.getDescription() + " Acquired on " + a.getDateAcquired() + " for " + a.getOriginalCost() + " is now worth: " + a.getValue());
            networth += a.getValue();
        }

        System.out.println("Total net worth:" + networth);
    }


}