package com.example.mark.retrofitpractice_01.model;

import java.util.List;

public class Docs {

  private String title_suggest;
  private List<String> author_name;

  public Docs() {
  }

  public Docs(String title_suggest) {
    this.title_suggest = title_suggest;
  }

  public String getTitle_suggest() {
    return title_suggest;
  }

  public void setTitle_suggest(String title_suggest) {
    this.title_suggest = title_suggest;
  }

  public List<String> getAuthor_name() {
    return author_name;
  }

  public void setAuthor_name(List<String> author_name) {
    this.author_name = author_name;
  }
}
