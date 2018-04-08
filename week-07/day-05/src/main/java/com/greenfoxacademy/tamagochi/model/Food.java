package com.greenfoxacademy.tamagochi.model;

public class Food {

  private String foodType;

  public Food() {
  }

  public Food(String foodType) {
    this.foodType = foodType;
  }

  public String getFoodType() {
    return foodType;
  }

  public void setFoodType(String foodType) {
    this.foodType = foodType;
  }
}
