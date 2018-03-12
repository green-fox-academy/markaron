package aircraftcarrier;

public class Aircraft {
  int currentAmmo = 0;
  int maxAmmo;
  int baseDmg;
  int dmgDealt;
  String typeOfPlane;

  public int fight(){
    this.currentAmmo = 0;
    return dmgDealt = this.baseDmg * this.maxAmmo;
  }

  public int refill(int refillAmmo){
    refillAmmo = refillAmmo - this.currentAmmo;
    this.currentAmmo = this.maxAmmo;
    return refillAmmo;
  }

  public String getType(){
    return this.typeOfPlane;
  }

  public String getStatus(){
    String status;
    return status = "Type " + this.typeOfPlane + ", Ammo: " + this.currentAmmo + ", Base Damage: " + this.baseDmg +
            ", All damage: " + this.baseDmg*this.maxAmmo;
  }

  public boolean isPriority(){
    return this.typeOfPlane.equals("F35");
  }
}
