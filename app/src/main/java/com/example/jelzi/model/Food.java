package com.example.jelzi.model;

public class Food {

    private String foodName, foodKey;
    private double fat, prot, carbh, cals;

    public Food(){
    }

    public Food(String foodName, String foodKey, double fat, double prot, double carbh, double cals) {
        this.foodName = foodName;
        this.foodKey = foodKey;
        this.fat = fat;
        this.prot = prot;
        this.carbh = carbh;
        this.cals = cals;
    }

    public String getFoodKey() {
        return foodKey;
    }

    public void setFoodKey(String foodKey) {
        this.foodKey = foodKey;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getProt() {
        return prot;
    }

    public void setProt(double prot) {
        this.prot = prot;
    }

    public double getCarbh() {
        return carbh;
    }

    public void setCarbh(double carbh) {
        this.carbh = carbh;
    }

    public double getCals() {
        return cals;
    }

    public void setCals(double cals) {
        this.cals = cals;
    }
}
