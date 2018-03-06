package TheGarden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> myPlants = new ArrayList<>();

  public void flowerAdder (Flower flower, String color){
    myPlants.add(new Flower(color));
  }

  double wateringAmount = 0;




  public void watering (double wateringAmount) {
    int needsWater = 0;

  }
}
