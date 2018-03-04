import java.util.ArrayList;
import java.util.List;

public class Farm {
  List<Animal> animals = new ArrayList<>();
  int numberOfSlots = 5;

  public void add (Animal animal){
    this.animals.add(animal);
  }
  public void breed(){
    if ( numberOfSlots > 0 ){
      this.animals.add(new Animal());
      numberOfSlots--;
    } else {
      System.out.println("no more room for animals");
    }
  }

  public void slaughter(){
    int leastHungry = animals.get(0).hunger;
    int tempAnimalIndex = 0;
    for (int i = 0; i <animals.size()-1 ; i++) {
      if (animals.get(i).hunger < leastHungry){
        tempAnimalIndex = i;
      }
    }
    System.out.println("The least hungry had " + animals.get(tempAnimalIndex).hunger + " hunger. ");
    animals.remove(tempAnimalIndex);
  }

  @Override
  public String toString() {
    return "Farm{" +
            "animals=" + animals +
            ", numberOfSlots= " + numberOfSlots +
            '}';
  }
}
