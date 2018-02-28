public class Station {
  float gasAmount;

  public void refill (Car ferrari){
    this.gasAmount -= ferrari.capacity;
    ferrari.gasAmount += 100;
  }
}
