package TheGarden;

import java.util.ArrayList;
import java.util.List;

public class GardenMain {
  public static void main(String[] args) {
    Garden myGarden = new Garden();


    myGarden.flowerAdder("blue");
    myGarden.flowerAdder("yellow");
    myGarden.treeAdder("purple");
    myGarden.treeAdder("orange");
    System.out.println(myGarden);


  }

}
