package com.greenfoxacademy.tamagochi.model;

import java.util.ArrayList;
import java.util.List;

public class Pet {
  private String name;
  private List<Trick> trick;
  private String food;
  private String drink;

  public Pet(String name) {
    this.name = name;
    trick = new ArrayList<>();
  }

  public String getTrick(){
    if(trick.size() != 0){
      return trick.toString();
    } else {
      return  " Your pet is stupid";
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
