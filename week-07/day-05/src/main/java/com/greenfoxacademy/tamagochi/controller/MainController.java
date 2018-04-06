package com.greenfoxacademy.tamagochi.controller;

import com.greenfoxacademy.tamagochi.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  Pet pet;

  @GetMapping("/")
  public String main(@RequestParam (name = "petname", required = false) String petName, Model model){
    if(pet.getName() == null){
      pet.setName("Mr.Fox");
    } else {
      pet.setName(petName);
    }
    model.addAttribute("petName", pet.getName());
    return "index";
  }

  @GetMapping("/login")
  public String loginPage(){
    return "login";
  }

  @PostMapping("/login")
  public String loginName(@ModelAttribute(name = "petName") String petName, Model model){
    pet.setName(petName);
    model.addAttribute("petName",pet.getName());
    return "redirect:/?petname=" + petName;
  }
}
