import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
  List<Sharpie> mySharpieSet;

  public SharpieSet(){
    this.mySharpieSet = new ArrayList<>();
  }

  public boolean countUsable () {
    for (Sharpie sharpie : this.mySharpieSet) {
      if (sharpie.inkAmount > 0) {
        return true;
      }
    }
    return false;
  }

  public List<Sharpie> getCurrent(){
    return mySharpieSet;
  }

  public void add(Sharpie markers){
    mySharpieSet.add(markers);
  }

  public void removeTrash (){
    for (Sharpie sharpie: this.mySharpieSet){
      if (sharpie.inkAmount < 0){
        mySharpieSet.remove(sharpie);
      }
    }
  }
}
