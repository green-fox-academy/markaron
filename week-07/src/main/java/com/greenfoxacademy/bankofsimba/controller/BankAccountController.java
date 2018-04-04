package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankAccountController {

  @RequestMapping("/show")
  public String showAccount(Model model){
    model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));
    return "index";
  }
}
