package com.greenfoxacademy.dependency.controller;

import com.greenfoxacademy.dependency.model.UtilityService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Links {

  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String usefulLinks(){
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String colorBackGround(Model model){
    model.addAttribute("theColor", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String email(Model model, @RequestParam(name = "email") String email ){
    model.addAttribute("isMailValid", utilityService.emailValidator(email));
    model.addAttribute("email", email);
    return "email";

  }
}
