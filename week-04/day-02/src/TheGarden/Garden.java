package TheGarden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> myPlants = new ArrayList<>();

  public void flowerAdder (String color){
    myPlants.add(new Flower(color));
  }
  public void treeAdder (String color){
    myPlants.add(new Tree(color));
  }



  @Override
  public String toString() {
    return "Garden{" +
            "myPlants=" + myPlants +
            '}';
  }
}

