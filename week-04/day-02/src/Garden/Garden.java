package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Planties> myPlants;

  public Garden() {
    this.myPlants = new ArrayList<>();
  }

  public void addFlower(String color) {
    myPlants.add(new Planties.Flower(color));
  }

  public void addTree(String color) {
    myPlants.add(new Planties.Tree(color));
  }

  public void check(){
    for (Planties myPlant : myPlants) {
      myPlant.plantiesCheckWater();
    }
  }

  public void waterTheGarden(double waterinAmount) {
    int needWaterCounter = 0;
    System.out.println("Watering the green with " + waterinAmount);
    for (int j = 0; j <= 1; j++) {
      for (Planties myPlant : myPlants) {
        if (myPlant.waterNeed > myPlant.wetnessOfPlant) {
          needWaterCounter++;
          if (j == 1) {
            myPlant.setWaterAmount(waterinAmount);
          }
        }
      }
      waterinAmount = waterinAmount / needWaterCounter;
    }
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
