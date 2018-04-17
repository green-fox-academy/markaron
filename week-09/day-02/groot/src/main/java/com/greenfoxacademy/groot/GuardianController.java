package com.greenfoxacademy.groot;

import com.greenfoxacademy.groot.model.ErrorObj;
import com.greenfoxacademy.groot.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Object groot(@RequestParam(name = "message", required = false) String word) {
    if (word != null) {
      return new Message(word);
    } else {
      return new ErrorObj("I am Groot!");
    }
  }
}
