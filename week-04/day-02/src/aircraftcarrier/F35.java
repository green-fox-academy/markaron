package aircraftcarrier;

public class F35 extends Aircraft {
  private static final int MAX_AMMO = 12;
  private static final int BASE_DMG = 50;

  public F35() {
    super("F35", MAX_AMMO, BASE_DMG);
  }
}
