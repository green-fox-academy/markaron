package aircraftcarrier;

public class Aircraft {
  private int currentAmmo = 0;
  private int maxAmmo;
  int baseDmg;
  int dmgDealt;
  String typeOfPlane;

  public Aircraft(String typeOfPlane, int maxAmmo, int baseDmg) {
    this.typeOfPlane = typeOfPlane;
    this.maxAmmo = maxAmmo;
    this.baseDmg = baseDmg;
    currentAmmo = 0;
  }

  public int fight() {
    this.currentAmmo = 0;
    return dmgDealt = this.baseDmg * this.maxAmmo;
  }

  public void refill(int refillAmmo) {
    if (refillAmmo >= 0) {
      for (int i = 0; i < refillAmmo; i++) {
        if (this.currentAmmo < this.maxAmmo) {
          this.currentAmmo++;
        }
      }
    } else {
      System.out.println("Not enough ammo for planes.");
    }
  }

  public String getType() {
    return this.typeOfPlane;
  }

  public String getStatus() {
    String status;
    return status = "Type " + this.typeOfPlane + ", Ammo: " + this.currentAmmo + ", Base Damage: " + this.baseDmg +
            ", All damage: " + this.baseDmg * this.maxAmmo;
  }

  public boolean isPriority() {
    return this.typeOfPlane.equals("F35");
  }

  public int getCurrentAmmo() {
    return this.currentAmmo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  @Override
  public String toString() {
    return "AIRCRAFT {" +
            "currentAmmo=" + currentAmmo +
            ", maxAmmo=" + maxAmmo +
            ", baseDmg=" + baseDmg +
            ", dmgDealt=" + dmgDealt +
            ", typeOfPlane='" + typeOfPlane + '\'' +
            '#';
  }
}
