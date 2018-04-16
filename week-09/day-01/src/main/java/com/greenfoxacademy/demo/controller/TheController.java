package com.greenfoxacademy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TheController {

  @GetMapping("/")
  public String indexPage(){
    return "index";
  }
}
