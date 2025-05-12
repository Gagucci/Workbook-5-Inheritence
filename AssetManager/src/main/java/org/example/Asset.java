package org.example;

public class Asset {
    private String description;
    private String dateAcquired;
    private double originalCost;

    public String getDescription() { return description; }
    public String getDateAcquired() { return dateAcquired; }
    public double getOriginalCost() { return originalCost; }

    public void setDescription(String description) { this.description = description; }
    public void setDateAcquired(String dateAcquired) { this.dateAcquired = dateAcquired; }
    public void setOriginalCost(double originalCost) { this.originalCost = originalCost; }
}
