package com.greenfoxacademy.tamagochi.controller;

import com.greenfoxacademy.tamagochi.db.FoodDb;
import com.greenfoxacademy.tamagochi.db.PetDb;
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
  PetDb pets;
  @Autowired
  FoodDb food;

  String nameOfPet = "";

  @GetMapping("/")
  public String main(@RequestParam (name = "petname", required = false) String petName, Model model){
    if(pets.getSize() == 0){
      petName = " Mr. Fox ";
      model.addAttribute("petName", petName);
    } else {
      model.addAttribute("petName", pets.getPet(petName));
    }
    nameOfPet = petName;
    return "index";
  }

  @GetMapping("/login")
  public String loginPage(){
    return "login";
  }

  @GetMapping("/nutritionStore")
  public String nutStore(@ModelAttribute(name = "petName") String petName, Model model){
    petName = nameOfPet;
    model.addAttribute("petName", petName);
    model.addAttribute("foodDb",food.findAll());
    return "nutritionStore";
  }

  //@PostMapping
  //itt adom meg mit kap enni az adott pet

  @PostMapping("/login")
  public String loginName(@ModelAttribute(name = "petName") String petName, Model model){
    pets.addPet(new Pet(petName));
    model.addAttribute("petName", petName);
    return "redirect:/?petname=" + petName;
  }
}
