package com.greenfoxacademy.demo.model;

public class Greet {
  private String welcome_message;

  public Greet(String message) {
    this.welcome_message = message;
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcome_message) {
    this.welcome_message = welcome_message;
  }
}
