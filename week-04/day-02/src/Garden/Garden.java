package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Flower> myFlowers;
  private int wateringAmount;

  public Garden() {
    this.myFlowers = new ArrayList<>();
  }

  public void addFlower(String color){
     myFlowers.add(new Flower(color));
   }

   public void gardenCheck(){
     for (int i = 0; i <myFlowers.size() ; i++) {
       if (myFlowers.get(i).flowerThirsty()){
         System.out.println("The " + myFlowers.get(i).getColor() + " needs water.");
       } else {
         System.out.println("The " + myFlowers.get(i).getColor() + " dosen't need water.");
       }
     }
   }

   public void waterTheGarden(double wateringAmount){
    int needWaterCounter = 0;
     for (int j = 0; j <= 1 ; j++) {
       for (Flower myFlower : myFlowers) {
         if (myFlower.flowerThirsty()) {
           needWaterCounter++;
           if (j == 1) {
             myFlower.setWaterAmount(wateringAmount);
           }
         }
       }
       wateringAmount = wateringAmount / needWaterCounter;
     }
  }

  @Override
  public String toString() {
    return "Garden{" +
            "myFlowers=" + myFlowers +
            '}';
  }
}
