package aircraftcarrier;

public class Aircraft {
  private int currentAmmo;
  private int maxAmmo;
  private int baseDmg;
  private int dmgDealt;
  private String typeOfPlane;

  public Aircraft(String typeOfPlane, int maxAmmo, int baseDmg) {
    this.typeOfPlane = typeOfPlane;
    this.maxAmmo = maxAmmo;
    this.baseDmg = baseDmg;
    currentAmmo = 0;
  }

  public void setCurrentAmmoToNull() {
    dmgDealt = this.baseDmg * this.currentAmmo;
    this.currentAmmo = 0;
  }

  public int getAircraftDmg(){
    dmgDealt = this.baseDmg * this.currentAmmo;
    return dmgDealt;
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

  public String getAircraftStatus() {
    String status;
    return status = "Type " + this.typeOfPlane + ", Ammo: " + this.currentAmmo + ", Base Damage: " + this.baseDmg +
            ", All damage: " + this.baseDmg * this.currentAmmo + "\n";
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
}
