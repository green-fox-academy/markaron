import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Trees {
  public static void main(String[] args) {
    ArrayList<Map<String, Object>> trees = new ArrayList<Map<String, Object>>();

    Map<String, Object> tree0 = new HashMap<String, Object>();
    tree0.put("type", "akasztofa");
    tree0.put("leafColor", "black");
    tree0.put("age", 12);
    tree0.put("sex", "female");
    trees.add( tree0 );

    Map<String, Object> tree1 = new HashMap<String, Object>();
    tree1.put("type", "bitófa");
    tree1.put("leafColor", "blue");
    tree1.put("age", 23);
    tree1.put("sex", "male");
    trees.add( tree1 );

    Map<String, Object> tree2 = new HashMap<String, Object>();
    tree2.put("type", "talpfa");
    tree2.put("leafColor", "orange");
    tree2.put("age", 34);
    tree2.put("sex", "female");
    trees.add( tree2 );

    Map<String, Object> tree3 = new HashMap<String, Object>();
    tree3.put("type","palmtree");
    tree3.put("leafColor", "red");
    tree3.put("age", 32);
    tree3.put("sex", "male");
    trees.add( tree3 );

    Map<String, Object> tree4 = new HashMap<String, Object>();
    tree4.put("type", "honeytree");
    tree4.put("leafColor", "yellow");
    tree4.put("age", 54);
    tree4.put("sex", "male");
    trees.add( tree4 );

  }
}
