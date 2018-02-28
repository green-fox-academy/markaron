import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {
  List<Animal> myAnimals = new ArrayList<>();

  public List<Animal> breed() {
    Animal pigeon = new Animal();

    for (int i = 0; i < myAnimals.size(); i++) {
      if (myAnimals.get(i) == null) {
        myAnimals.add(i, pigeon);
        return myAnimals;
      }
    }
    return myAnimals;
  }


  public static void main(String[] args) {
    Farm myFarm = new Farm();
    myFarm.breed();
    System.out.println(myFarm.myAnimals);


  }
}