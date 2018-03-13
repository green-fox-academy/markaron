package aircraftcarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  private List<Aircraft> carrier;
  private int carrierAmmoStore;
  private int carrierHealth;

  public Carrier(int carrierAmmoStore, int carrierHealth) {
    this.carrierAmmoStore = carrierAmmoStore;
    this.carrierHealth = carrierHealth;
    carrier = new ArrayList<>();
  }

  public void addAircraft(String aircraftType){
    if(aircraftType.toUpperCase().equals("F35")){
      carrier.add(new F35());
    } else if (aircraftType.toUpperCase().equals("F16")){
      carrier.add(new F16());
    } else {
      System.out.println("There is no such a plane as " + aircraftType);
    }
  }

  public void fill (){
    int leftOverAmmo;
    int ammoNeeded = 0;
    int refillAmmo = 0;

    if (this.carrierAmmoStore <= 0){
      System.out.println("Your ship is out of ammo.");
    } else {
      for (int i = 0; i < carrier.size(); i++) {
        ammoNeeded += carrier.get(i).getMaxAmmo() - carrier.get(i).getCurrentAmmo();
      }
      if (ammoNeeded > this.carrierAmmoStore) {
        for (int i = 0; i < carrier.size(); i++) {
          if (carrier.get(i).isPriority()) {
            carrier.get(i).refill(this.carrierAmmoStore);
            this.carrierAmmoStore -= carrier.get(i).getCurrentAmmo();
          }
        }
        for (int i = 0; i < carrier.size(); i++) {
          if (!carrier.get(i).isPriority()) {
            carrier.get(i).refill(this.carrierAmmoStore);
            this.carrierAmmoStore -= carrier.get(i).getCurrentAmmo();
          }
        }
      } else {
        for (int i = 0; i < carrier.size(); i++) {
          carrier.get(i).refill(this.carrierAmmoStore);
          this.carrierAmmoStore -= carrier.get(i).getCurrentAmmo();
        }
      }
    }
  }

  @Override
  public String toString() {
    return "Carrier{" +
            "planesList=" + carrier +
            ",\n carrierAmmoStore=" + carrierAmmoStore +
            ", carrierHealth=" + carrierHealth +
            '}';
  }
}
