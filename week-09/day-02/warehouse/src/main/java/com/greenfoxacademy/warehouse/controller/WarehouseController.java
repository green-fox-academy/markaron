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

import javax.persistence.GeneratedValue;
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
    return "warehouse";
  }

  @PostMapping(value = "/warehouse/summary")
  public String summary(@ModelAttribute(name = "item") String itemName,
                        @ModelAttribute(name = "size") String sizeNum,
                        @ModelAttribute(name = "amount") int amount,
                        Model model) {
    model.addAttribute("itemName", itemName);
    model.addAttribute("sizeNum", sizeNum);
    model.addAttribute("amount", amount);
    model.addAttribute("quantity", repository.findByItemNameAndSize(itemName,sizeNum));
    model.addAttribute("manufact", repository.findBySizeAndItemName(sizeNum,itemName));
    model.addAttribute("category", repository.findDistinctFirstByItemName(itemName).get(0));
    model.addAttribute("subTotal", amount * repository.findByItemNameAndSize(itemName,sizeNum));
    return "summary";
  }

  @GetMapping(value = "/warehouse/query")
  public List<Warehouse> query(@PathVariable(value = "price") int price,
                               @PathVariable(value = "type") String type){
    List<Warehouse> warehouseList = new ArrayList<>();

    return warehouseList;
  }
}
