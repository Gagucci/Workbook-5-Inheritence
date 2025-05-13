package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;


    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public Vehicle() {
    }

    public String getMakeModel() { return makeModel; }
    public int getYear() { return year; }
    public int getOdometer() { return odometer; }

    public void setMakeModel(String makeModel) { this.makeModel = makeModel; }
    public void setYear(int year) { this.year = year; }
    public void setOdometer(int odometer) { this.odometer = odometer; }

    public double getValue() {
        double ogCost = getOriginalCost();
        String dateAcquired = getDateAcquired();
        LocalDate currentDate = LocalDate.now();
        double value = 0.0;

        if (dateAcquired != null) {
            LocalDate acquiredDate = LocalDate.parse(dateAcquired);
            int yearsOwned = currentDate.getYear() - acquiredDate.getYear();
            if (yearsOwned >= 0 && yearsOwned <= 3) {
                value = ogCost - ((ogCost * 0.03) * yearsOwned);
            } else if (yearsOwned > 3 && yearsOwned <= 6) {
                value = ogCost - ((ogCost * 0.06) * yearsOwned);
            } else if (yearsOwned > 6 && yearsOwned <= 10) {
                value = ogCost - ((ogCost * 0.08) * yearsOwned);
            }
        }

        double finalCost;
        if (odometer <= 100000 && (!getMakeModel().contains("Toyota") || !getMakeModel().contains("Honda"))) {
            finalCost = value - (value * 0.25);
        } else {
            finalCost = value;
        }

        return finalCost;
    }

}
