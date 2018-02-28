import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> mySharpieSet;

  public SharpieSet(){
    this.mySharpieSet = new ArrayList<>();
  }
  public boolean countUsable (Sharpie sharpie){
    if (sharpie.inkAmount > 0 );
      return true;
  }
  public List<Sharpie> getCurrent(){
    return mySharpieSet;
  }

  public void add(Sharpie sharpieColors){
    mySharpieSet.add(sharpieColors);
  }
  public void removeTrash (){
    for (Sharpie sharpie: this.mySharpieSet){
      if (sharpie.inkAmount <= 0){
        mySharpieSet.remove(sharpie);
      }
    }
  }
}
