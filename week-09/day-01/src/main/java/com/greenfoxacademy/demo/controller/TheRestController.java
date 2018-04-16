package com.greenfoxacademy.demo.controller;


import com.greenfoxacademy.demo.model.Append;
import com.greenfoxacademy.demo.model.Doubling;
import com.greenfoxacademy.demo.model.ErrorObject;
import com.greenfoxacademy.demo.model.Greet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TheRestController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(name = "input", required = false) Integer number) {
    if (number != null) {
      return new Doubling(number);
    } else {
      return new ErrorObject("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(name = "name", required = false) String name,
                        @RequestParam(name = "title", required = false) String title) {
    if (name == null) {
      return new ErrorObject("Please provide a name!");
    } else if (title == null) {
      return new ErrorObject("Please provide a title!");
    } else {
      return new Greet("Oh, hi there " + name + ", my dear " + title + "!");
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object append(@PathVariable(value = "appendable", required = false) String word){
    return new Append(word+"a");
  }
}
