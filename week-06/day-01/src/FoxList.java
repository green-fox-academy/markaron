import java.util.ArrayList;
import java.util.List;

public class FoxList {
  List<Fox> foxes;

  public FoxList() {
    foxes = new ArrayList<>();
  }

  public void add(Fox fox){
    foxes.add(fox);
  }

  public void findGreen(){
    foxes.stream()
            .filter(c -> c.color.equals("green"));
    System.out.println(foxes);
  }
}
