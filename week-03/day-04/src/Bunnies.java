public class Bunnies {
  public static void main(String[] args) {
    int bunnies = 10;

    System.out.println(bunnieEarCounter(bunnies));
  }

  public static int bunnieEarCounter (int bunnies){
    if ( bunnies == 0){
      return 0;
    }else{
      return 2 + bunnieEarCounter(bunnies-1);
    }
  }
}
