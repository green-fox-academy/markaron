package com.greenfoxacademy.demo.controller;


import com.greenfoxacademy.demo.model.Doubling;
import com.greenfoxacademy.demo.model.ErrorObject;
import com.greenfoxacademy.demo.model.Greet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheRestController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(name = "input", required = false) Integer number){
    if (number != null){
      return new Doubling(number);
    } else {
      return new ErrorObject("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(name = "name", required = false) String name,
                        @RequestParam(name = "title", required = false) String title){
    return new Greet("Oh, hi there " + name + ", my dear " + title + "!");
  }
}
