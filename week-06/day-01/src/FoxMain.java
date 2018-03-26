public class FoxMain {

  public static void main(String[] args) {
    FoxList foxList = new FoxList();
    foxList.add(new Fox("roka", "sick","red"));
    foxList.add(new Fox("medve", "ill", "green"));
    foxList.add(new Fox("Greg", "gay","pink"));

    foxList.findGreen();
  }
}
