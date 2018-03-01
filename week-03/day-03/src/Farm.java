import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {
  List<Animal> myAnimals = new ArrayList<>();

//  public Farm breed(Farm myAnimals) {
//    Animal pigeon = new Animal();
//
//    for (int i = 0; i < Farm.size(); i++) {
//      if (myAnimals.get(i) == null) {
//        myAnimals.add(i, pigeon);
//        return myAnimals;
//      }
//    }
//    return myAnimals;
//  }

  public static void main(String[] args) {
    Farm myFarm = new Farm();
//    myFarm.breed(myFarm);
    System.out.println(myFarm.myAnimals);


  }
}