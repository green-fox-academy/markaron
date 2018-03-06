package Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
  private List<Flower> myFlowers;

  public Garden() {
    this.myFlowers = new ArrayList<>();
  }

  public void addFlower(String color){
     myFlowers.add(new Flower(color));
   }

   public void waterGarden(){
     for (int i = 0; i <myFlowers.size() ; i++) {
       if (myFlowers.get(i).flowerThirsty()){
         System.out.println("The " + myFlowers.get(i).getColor() + " needs water.");
       } else {
         System.out.println("The " + myFlowers.get(i).getColor() + " dosent need water.");
       }
     }
   }

   public void

  @Override
  public String toString() {
    return "Garden{" +
            "myFlowers=" + myFlowers +
            '}';
  }
}
