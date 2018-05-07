package com.example.mark.retrofitpractice_01.model;

import java.util.List;

public class Docs {

  private String title_suggest;
  private List<String> author_name;
  private int first_publish_year;
  private List<String> language;
  private List<String> subject;
  private List<String> publish_place;

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

  public int getFirst_publish_year() {
    return first_publish_year;
  }

  public void setFirst_publish_year(int first_publish_year) {
    this.first_publish_year = first_publish_year;
  }

  public List<String> getLanguage() {
    return language;
  }

  public void setLanguage(List<String> language) {
    this.language = language;
  }

  public List<String> getSubject() {
    return subject;
  }

  public void setSubject(List<String> subject) {
    this.subject = subject;
  }

  public List<String> getPublish_place() {
    return publish_place;
  }

  public void setPublish_place(List<String> publish_place) {
    this.publish_place = publish_place;
  }
}
