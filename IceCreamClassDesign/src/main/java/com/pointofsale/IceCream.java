package com.pointofsale;

import java.util.Objects;

public class IceCream {

    String flavor;
    double pricePerScoop;
    int scoops;

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    double totalCost;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.pricePerScoop, pricePerScoop) == 0 && scoops == iceCream.scoops && Double.compare(iceCream.totalCost, totalCost) == 0 && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, pricePerScoop, scoops);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", pricePerScoop=" + pricePerScoop +
                ", quantity=" + scoops +
                '}';
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPricePerScoop() {
        return pricePerScoop;
    }

    public void setPricePerScoop(double pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    public void addSprinkles() {
        this.totalCost += 1.00;
    }

    public void addChocolate() {
        this.totalCost += 1.50;
    }

    public void addWaffleCone() {
        this.totalCost += 2.50;
    }
}
