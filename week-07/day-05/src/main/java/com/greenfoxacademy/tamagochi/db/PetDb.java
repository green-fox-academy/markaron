package com.greenfoxacademy.tamagochi.db;

import com.greenfoxacademy.tamagochi.model.Pet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PetDb {

  public final List<Pet> PETS;

  public PetDb() {
    PETS = new ArrayList<>();
  }

  public void addPet(Pet pet){
    PETS.add(pet);
  }

  public String getPet(String name){
    String result = "";
    for (int i = 0; i < PETS.size(); i++) {
      if(PETS.get(i).getName().equals(name)){
        result = PETS.get(i).getName() + ". " +  PETS.get(i).getTrick();
      }
    }
  return result;
  }

  public int getSize(){
    return PETS.size();
  }

  public List<Pet> getPETS() {
    return PETS;
  }
}
