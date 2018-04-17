package com.greenfoxacademy.warehouse.controller;

import com.greenfoxacademy.warehouse.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WarehouseController {

  @Autowired
  WarehouseRepository repository;

  @GetMapping(value = "/warehouse")
  public String mainPage(Model model){
    model.addAttribute("cloth", repository.findAll());
    return "warehouse";
  }
}
