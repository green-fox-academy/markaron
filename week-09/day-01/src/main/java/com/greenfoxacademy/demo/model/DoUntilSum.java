package com.greenfoxacademy.demo.model;

public class DoUntilSum {
  private Integer result = 0;

  public DoUntilSum() {
  }

  public DoUntilSum(Integer input) {
    for (int i = 0; i <= input; i++) {
      this.result += i;
    }
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
