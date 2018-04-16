package com.greenfoxacademy.demo.model;

public class DoUntilFactor {
  private Integer result = 1;

  public DoUntilFactor() {
  }

  public DoUntilFactor(Integer input) {
    for (int i = 1; i <= input ; i++) {
      result *= i;
    }
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
