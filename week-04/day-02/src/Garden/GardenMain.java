package Garden;

public class GardenMain {
  public static void main(String[] args) {
    Garden myGarden = new Garden();

    myGarden.addFlower("blue");
    myGarden.addFlower("yellow");
    System.out.println(myGarden);
    myGarden.gardenCheck();
    myGarden.waterTheGarden(20);
    myGarden.gardenCheck();
    System.out.println(myGarden);

  }
}
