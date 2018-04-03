package com.greenfoxacademy.springstart.controllers;

import java.util.Arrays;
import java.util.Random;

public class Greeting {
  private long id;
  private String content;

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public Greeting(){
    this.content = toString();
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  @Override
  public String toString() {
    return "" + hellos[new Random().nextInt(hellos.length)] +
            ',';
  }
}
