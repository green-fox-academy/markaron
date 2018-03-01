public class PirateBrawl_Main {
  public static void main(String[] args) {
    Pirate Joe = new Pirate("Joe");
    Pirate Frank = new Pirate("Frank");
    Pirate Hanz = new Pirate("Hanz");
    Pirate Ubba = new Pirate("Ubba");

    System.out.println(Joe);


    Hanz.brawl(Ubba);
    System.out.println("Hanz passout: " + Hanz.passOut);
    System.out.println("Ubba passout: " + Ubba.passOut);
    System.out.println("Hanz dead :( " + Hanz.dead);
    System.out.println("Ubba dead :( " + Ubba.dead);
  }
}
