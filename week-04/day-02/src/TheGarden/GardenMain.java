package TheGarden;

import java.util.ArrayList;
import java.util.List;

public class GardenMain {
  public static void main(String[] args) {
    Garden myGarden = new Garden();


    myGarden.flowerAdder(new Flower("blue"),"blue");

    System.out.println(myGarden);
  }

}
