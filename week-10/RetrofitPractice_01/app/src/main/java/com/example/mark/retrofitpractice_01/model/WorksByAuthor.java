package com.example.mark.retrofitpractice_01.model;

import java.util.List;

public class WorksByAuthor {
  private int start;
  private int num_found;
  private int numFound;
  private List<Docs> docs;

  public WorksByAuthor() {
  }

  public WorksByAuthor(int start, int num_found, int numFound, List<Docs> docsList) {
    this.start = start;
    this.num_found = num_found;
    this.numFound = numFound;
    this.docs = docsList;
  }

  public int getStart() {
    return start;
  }

  public void setStart(int start) {
    this.start = start;
  }

  public int getNum_found() {
    return num_found;
  }

  public void setNum_found(int num_found) {
    this.num_found = num_found;
  }

  public int getNumFound() {
    return numFound;
  }

  public void setNumFound(int numFound) {
    this.numFound = numFound;
  }

  public List<Docs> getDocsList() {
    return docs;
  }

  public void setDocsList(List<Docs> docsList) {
    this.docs = docsList;
  }
}
