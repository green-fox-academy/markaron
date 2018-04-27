package com.example.mark.retrofitpractice_01.model;

import java.util.List;

public class Work {

  private String title;
  private List<Author> authors;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public List<Author> getAuthors() {
    return authors;
  }

  public void setAuthors(List<Author> authors) {
    this.authors = authors;
  }
}
