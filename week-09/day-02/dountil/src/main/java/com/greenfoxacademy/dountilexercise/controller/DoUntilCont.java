package com.greenfoxacademy.dountilexercise.controller;

import com.greenfoxacademy.dountilexercise.model.DoUntilRequest;
import com.greenfoxacademy.dountilexercise.model.DoUntilResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilCont {

  @PostMapping("/dountil/{what}")
  public DoUntilResult respondfive(@PathVariable String what, @RequestBody DoUntilRequest request){
    if(what.equals("sum")){
      return new DoUntilResult(5);
    } else if (what.equals("factor")) {
      return new DoUntilResult(120);
    } else {
      throw new Error("Can you even What?");
    }
  }

}
