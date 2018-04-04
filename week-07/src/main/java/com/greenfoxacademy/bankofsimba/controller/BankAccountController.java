package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.Bank;
import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankAccountController {
  Bank bank = new Bank();
  BankAccount bankAccount;

  @GetMapping("/show")
  public String showAccount(Model model){
    model.addAttribute("account", new BankAccount("Simba", 2000, "lion"));
    return "index";
  }

  @GetMapping(value = "/bankOfSimba")
  public String showBank(Model model){
        model.addAttribute("bank",bank.getAccountList());
    return "bankofsimba";
  }
}
