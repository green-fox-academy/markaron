package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  //private long id;
  private String content;

  public Greeting(String content) {
    this.id = getId();
    this.content = content;
  }

  public AtomicLong getId() {
    AtomicLong id = new AtomicLong();
    id.incrementAndGet();
    return id;
  }

  public String getContent() {
    return content;
  }
}
