package Garden;

public class Planties {
  String type;
  double waterNeed;
  double wetnessOfPlant = 0;
  String color;
  double waterAbsorb;

  public void plantiesCheckWater(){
    if (waterNeed > wetnessOfPlant){
      System.out.println("The " + color + type + " needs more water.");
    } else {
      System.out.println("The " + color + type + " doesn't need water.");
    }
  }

  public void setWaterAmount (double wateringAmount){
    wetnessOfPlant = wateringAmount * waterAbsorb;
  }


  public static class Flower extends Planties{

    public Flower(String color) {
      super.type = " Flower";
      super.waterNeed = 5;
      super.color = color;
      super.waterAbsorb = 0.75;

    }
  }


  public static class Tree extends Planties{
    public Tree(String color) {
      super.type = " Tree";
      super.waterNeed = 10;
      super.color = color;
      super.waterAbsorb = 0.4;
    }
  }

}
