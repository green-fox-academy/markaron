package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  @Override
  public String toString() {
    return "BankAccount{" +
            "name='" + name + '\'' +
            ", balance=" + balance +
            ", animalType='" + animalType + '\'' +
            '}';
  }
}
