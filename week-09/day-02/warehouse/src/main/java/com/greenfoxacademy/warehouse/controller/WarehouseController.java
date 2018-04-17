package com.greenfoxacademy.warehouse.controller;

import com.greenfoxacademy.warehouse.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WarehouseController {

  @Autowired
  WarehouseRepository repository;

  @GetMapping(value = "/warehouse")
  public String mainPage(Model model){
    model.addAttribute("items",repository.findDistinctByItemName());
    model.addAttribute("sizes",repository.findDistinctBySize());
    model.addAttribute("cloth", repository.findAll());
    return "warehouse";
  }

  @PostMapping(value = "/warehouse/summary")
  public String summary(@ModelAttribute(name = "item")String itemName,
                        @ModelAttribute(name = "size") String sizeNum,
                        @ModelAttribute(name = "amount") int amount,
                        Model model){
    model.addAttribute("itemName",itemName);
    model.addAttribute("sizeNum",sizeNum);
    model.addAttribute("amount",amount);
    return "summary";
  }
}
