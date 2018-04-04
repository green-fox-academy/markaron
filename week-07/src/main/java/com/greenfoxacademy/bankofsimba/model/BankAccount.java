package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private boolean isGood;

  public BankAccount(boolean isKing, String name, double balance, String animalType, boolean isGood) {
    this.isKing = isKing;
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isGood = isGood;
  }

  public String getName() {
    return name;
  }

  public String getBalance() {
    return String.format("%.2f", balance) + " Zebra";
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean getKing(){
    return isKing;
  }

  public boolean getGood(){
    return isGood;
  }

  @Override
  public String toString() {
    return "BankAccount( " +
            "name = " + name +
            ", balance = " + String.format("%.2f", balance) +
            " Zebra , animal type = " + animalType +
            ')';
  }
}
