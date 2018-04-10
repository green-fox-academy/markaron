package com.greeenfoxacademy.listingtodosh2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;

  public ToDo() {
  }

  public ToDo(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public String toString() {
    return "" + id +
      " " + title +
      ' ';
  }
}
