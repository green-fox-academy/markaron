package com.greenfoxacademy.tamagochi.model;

import java.util.List;

public class Pet {
  private String name;
  private List<Trick> trick;
  private String food;
  private String drink;

  public Pet(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
