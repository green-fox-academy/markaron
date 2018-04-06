package com.greenfoxacademy.tamagochi.db;

import com.greenfoxacademy.tamagochi.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetDb {

  public final List<Pet> PETS;

  public PetDb() {
    PETS = new ArrayList<>();
  }

  public void addPet(Pet pet){
    PETS.add(pet);
  }

  public List<Pet> getPETS() {
    return PETS;
  }
}
