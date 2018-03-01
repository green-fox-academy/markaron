public class Pirate {
  int intToxication;
  boolean passOut;

  public Pirate(int intToxication, double passOut) {
    this.intToxication = intToxication;
    this.passOut = passOut;
  }

  public static void drinkSomeRum(int intToxication){
    intToxication++;
  }

  public static void howsItGoingMate(Pirate pirate){
    if (pirate.intToxication < 4) {
      System.out.println("Pour me anudder!");
    }else{
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
      pirate.passOut = true;
    }
  }
}
