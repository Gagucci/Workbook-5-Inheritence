package org.example;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFeet;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFeet, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFeet = squareFeet;
        this.lotSize = lotSize;
    }

    public House() {
    }

    public String getAddress() { return address; }
    public int getCondition() { return condition; }
    public int getSquareFeet() { return squareFeet; }
    public int getLotSize() { return lotSize; }

    public void setAddress(String address) { this.address = address; }
    public void setCondition(int condition) { this.condition = condition; }
    public void setSquareFeet(int squareFeet) { this.squareFeet = squareFeet; }
    public void setLotSize(int lotSize) { this.lotSize = lotSize; }

    public double getValue() {
        double ogCost = getOriginalCost();
        double value = 0.0;
        if (condition == 1) {
            value = (ogCost + (180.00 * squareFeet)) + (.25 * lotSize);
        } else if (condition == 2) {
            value = (ogCost + (130.00 * squareFeet)) + (.25 * lotSize);
        } else if (condition == 3) {
            value = (ogCost + (90.00 * squareFeet)) + (.25 * lotSize);
        } else if (condition == 4) {
            value = (ogCost + (80.00 * squareFeet)) + (.25 * lotSize);
        }
        return value;
    }

}
