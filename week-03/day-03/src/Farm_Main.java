public class Farm_Main {
  public static void main(String[] args) {
    Farm myFarm = new Farm();
    myFarm.breed();
    myFarm.breed();
    myFarm.breed();
    myFarm.breed();
    myFarm.breed();

    myFarm.animals.get(1).eat();

    System.out.println(myFarm);

    myFarm.slaughter();

    System.out.println(myFarm);
  }
}
