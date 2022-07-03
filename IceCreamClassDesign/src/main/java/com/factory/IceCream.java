package com.factory;

import java.util.List;

public class IceCream {

    String flavor;
    double salePrice;
    double productionCost;
    double productionTime;
    List<Ingredients> ingredients;
    Boolean highTemperature = false;

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public double getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(double productionTime) {
        this.productionTime = productionTime;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public String temperatureCheck() {
          if(this.highTemperature) {
              return "Check room temp to protect against bacteria production";
          } else return "Temperature is good!";
    }

    public void discountPrice() {
        this.salePrice = this.salePrice * 0.9;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", salePrice=" + salePrice +
                ", productionCost=" + productionCost +
                ", productionTime=" + productionTime +
                ", ingredients=" + ingredients +
                ", highTemperature=" + highTemperature +
                '}';
    }
}
