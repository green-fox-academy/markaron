package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Planties> myPlants;
  private int wateringAmount;

  public Garden() {
    this.myPlants = new ArrayList<>();
  }

  public void addFlower(String color) {
    myPlants.add(new Planties.Flower(color));
  }

  public void addTree(String color) {
  }

  

//  public void waterTheGarden(double wateringAmount) {
//    int needWaterCounter = 0;
//    for (int j = 0; j <= 1; j++) {
//      for (Flower myFlower : myFlowers) {
//        if (myFlower.flowerThirsty()) {
//          needWaterCounter++;
//          if (j == 1) {
//            myFlower.setFlowerWaterAmount(wateringAmount);
//          }
//        }
//      }
//      wateringAmount = wateringAmount / needWaterCounter;
//    }
//  }

}
