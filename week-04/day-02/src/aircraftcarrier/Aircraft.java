package aircraftcarrier;

public class Aircraft {
  private int currentAmmo = 0;
  private int maxAmmo;
  int baseDmg;
  int dmgDealt;
  String typeOfPlane;

  public Aircraft() {
  }

  public int fight() {
    this.currentAmmo = 0;
    return dmgDealt = this.baseDmg * this.maxAmmo;
  }

  public int refill(int refillAmmo) {
    if (refillAmmo > 0) {
      for (int i = 0; i < refillAmmo; i++) {
        if (this.currentAmmo < this.maxAmmo)
        this.currentAmmo++;
        refillAmmo--;
      }
      System.out.println("Not enough ammo for planes.");
    }
    return refillAmmo;
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
    return currentAmmo;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  @Override
  public String toString() {
    return "Aircraft{" +
            "currentAmmo=" + currentAmmo +
            ", maxAmmo=" + maxAmmo +
            ", baseDmg=" + baseDmg +
            ", dmgDealt=" + dmgDealt +
            ", typeOfPlane='" + typeOfPlane + '\'' +
            '}';
  }
}
