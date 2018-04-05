package com.greenfoxacademy.dependency.Color;

import org.springframework.stereotype.Component;

@Component
public class RedColor implements MyColor {
  @Override
  public String printColor() {
    return "It is red in color...";
  }
}
