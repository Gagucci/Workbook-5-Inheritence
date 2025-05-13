package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new Vehicle("Honda S2000", "2025-01-01", 20000, "Honda S2000", 2025, 50000));
        assets.add(new Vehicle("Pickup Truck", "2018-01-01", 30000, "Ford F-150", 2018, 70000));
        assets.add(new House("House", "2015-01-01", 250000, "123 Main St", 1, 2000, 5000));
        assets.add(new House("Vacation Condo", "2017-01-01", 150000, "456 Elm St", 2, 1200, 2000));


        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Acquired on " + asset.getDateAcquired() + " for " + asset.getOriginalCost() + "\nwith it currently valued at: " + asset.getValue() + "\n");

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
                System.out.println("Condition: " + house.getCondition());
                System.out.println("Square Feet: " + house.getSquareFeet());
                System.out.println("Lot Size: " + house.getLotSize() + "\n");
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Odometer: " + vehicle.getOdometer() + "\n");
            }

        }



    }
}