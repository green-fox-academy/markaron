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

  public void addAircraft(String aircaftType){
    carrier.add(new F16());
  }

  public void fill (){
    int leftOverAmmo;
    for (int i = 0; i < carrier.size(); i++) {
      this.carrierAmmoStore -= carrier.get(i).currentAmmo;
    }
    leftOverAmmo = carrierAmmoStore;
  }

  @Override
  public String toString() {
    return "Carrier{" +
            "planesList=" + carrier +
            ", carrierAmmoStore=" + carrierAmmoStore +
            ", carrierHealth=" + carrierHealth +
            '}';
  }
}
