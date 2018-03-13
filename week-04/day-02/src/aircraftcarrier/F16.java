package aircraftcarrier;

public class F16 extends Aircraft{

  private static final int MAX_AMMO = 8;
  private static final int BASE_DMG = 30;

  public F16() {
    super("F16", MAX_AMMO, BASE_DMG);
  }
}
