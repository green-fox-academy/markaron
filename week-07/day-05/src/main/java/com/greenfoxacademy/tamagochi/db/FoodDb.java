package com.greenfoxacademy.tamagochi.db;

import com.greenfoxacademy.tamagochi.model.Food;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class FoodDb {

  public static final List<Food> FOOD = new ArrayList<>(Arrays.asList(
    new Food("Dried sand"),
    new Food("Cooked rock"),
    new Food("Roasted dune"),
    new Food("Sand pie")
  ));

  public List<Food> findAll(){
    return FoodDb.FOOD;
  }
}
