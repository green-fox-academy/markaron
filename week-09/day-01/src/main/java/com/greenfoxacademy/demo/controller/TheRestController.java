package com.greenfoxacademy.demo.controller;

import com.greenfoxacademy.demo.model.*;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/dountil/{what}")
  public Object doUntil(@PathVariable(value = "what", required = false) String what , DoUntil myObject){
    if(what.equals("sum")){
      myObject = new DoUntil(7);
      return new DoUntilSum(myObject.getUntil());
    } else if (what.equals("factor")){
      myObject = new DoUntil(4);
      return new DoUntilFactor(myObject.getUntil());
    } else {
      return new ErrorObject("Please provide a number!");
    }
  }
}
