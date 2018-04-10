package com.greeenfoxacademy.listingtodosh2.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ToDo {

  @Id
  private Long id;
  private String title;
  private boolean urgent = false;
  private boolean done = false;
}
