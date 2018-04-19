package com.greenfoxacademy.warehouse.controller;

import com.greenfoxacademy.warehouse.model.Warehouse;
import com.greenfoxacademy.warehouse.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WarehouseController {

  @Autowired
  WarehouseRepository repository;

  @GetMapping(value = "/warehouse")
  public String mainPage(Model model) {
    model.addAttribute("items", repository.findDistinctByItemName());
    model.addAttribute("sizes", repository.findDistinctBySize());
    model.addAttribute("cloth", repository.findAll());
    //model.addAttribute("error", "The selected item is out of stock.");
    return "warehouse";
  }

  @PostMapping(value = "/warehouse/summary")
  public String summary(@ModelAttribute(name = "item") String itemName,
                        @ModelAttribute(name = "size") String sizeNum,
                        @ModelAttribute(name = "amount") int amount,
                        Model model) {
    List<Warehouse> warehouses = repository.findByItemNameAndSize(itemName, sizeNum);
    if (warehouses.size() == 0) {
      return "redirect:/warehouse";
    } else {
      model.addAttribute("itemName", itemName);
      model.addAttribute("sizeNum", sizeNum);
      model.addAttribute("amount", amount);
      model.addAttribute("itemsList", warehouses);
      Warehouse warehouse = warehouses.get(0);
      model.addAttribute("subTotal", amount * warehouse.getUnitPrice());
      return "summary";
    }
  }
}
