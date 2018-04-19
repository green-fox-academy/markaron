package com.greenfoxacademy.warehouse.controller;

import com.greenfoxacademy.warehouse.model.JsonResponse;
import com.greenfoxacademy.warehouse.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WarehouseRestCont {

  @Autowired
  WarehouseRepository warehouseRepository;

  @GetMapping("/warehouse/query")
  public ResponseEntity warehouseQuery(@RequestParam(value = "price") float price,
                                       @RequestParam(value = "type") String type){
    if(type.equals("equal")){
      return new ResponseEntity(new JsonResponse("ok", warehouseRepository.findByUnitPriceEquals(price)), HttpStatus.OK);
    } else if(type.equals("lower")){
      return new ResponseEntity(new JsonResponse("ok", warehouseRepository.findByUnitPriceIsLessThan(price)), HttpStatus.OK);
    } else if (type.equals("higher")){
      return new ResponseEntity(new JsonResponse("ok", warehouseRepository.findByUnitPriceIsGreaterThan(price)), HttpStatus.OK);
    } else return new ResponseEntity(new JsonResponse("error"), HttpStatus.BAD_REQUEST);
  }
}
