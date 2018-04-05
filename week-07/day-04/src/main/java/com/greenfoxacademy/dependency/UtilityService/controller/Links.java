package com.greenfoxacademy.dependency.UtilityService.controller;

import com.greenfoxacademy.dependency.UtilityService.model.UtilityService;
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

  @GetMapping("useful/encode")
  public String encode(Model model, @RequestParam(name = "text") String text, @RequestParam(name = "num") int number){
    model.addAttribute("encodedWord", utilityService.caesar(text,number));
    return "encode";
  }


  @GetMapping("useful/decode")
  public String decode(Model model, @RequestParam(name = "text") String text, @RequestParam(name = "num") int number){
    model.addAttribute("decodedWord", utilityService.caesar(text,number-1));
    return "decode";
  }
}
