public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    Thing myThing1 = new Thing("Get milk");
    Thing myThing2 = new Thing("Remove the obstacles");
    Thing myThing3 = new Thing("Stand up");
    Thing myThing4 = new Thing("Eat lunch");
    fleet.add(myThing1);
    fleet.add(myThing2);
    fleet.add(myThing3);
    fleet.add(myThing4);
    myThing3.complete();
    myThing4.complete();
    System.out.println(fleet);
  }
}