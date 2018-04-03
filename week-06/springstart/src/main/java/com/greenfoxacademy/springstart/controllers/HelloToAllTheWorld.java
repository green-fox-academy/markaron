package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloToAllTheWorld {
  AtomicLong id = new AtomicLong();


  @RequestMapping("web/greettheworld")
  public String greetTheWorld(Model model, @RequestParam(name = "name") String name){
    model.addAttribute("hello", new Greeting());
    model.addAttribute("name",  name);
    model.addAttribute("id", id.addAndGet(1));
    return "greettheworld";

  }

}
