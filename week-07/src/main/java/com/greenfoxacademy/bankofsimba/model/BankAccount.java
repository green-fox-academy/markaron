package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;

  public BankAccount(String name, double balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public BankAccount() {
  }

  public String getName() {
    return name;
  }

  public String getBalance() {
    return String.format("%.2f", balance);
  }

  public String getAnimalType() {
    return animalType;
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
