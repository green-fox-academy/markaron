package Garden;

public class GardenMain {
  public static void main(String[] args) {
    Garden myGarden = new Garden();

    myGarden.addFlower("yellow");
    myGarden.addFlower("blue");
    myGarden.addTree("purple");
    myGarden.addTree("orange");
    myGarden.check();
    myGarden.waterTheGarden(40);
    myGarden.check();
    myGarden.waterTheGarden(70);
    myGarden.check();
  }
}
