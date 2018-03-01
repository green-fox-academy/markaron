public class Bunny2 {
  public static void main(String[] args) {
    int bunnies = 8;
    System.out.println(bunny2(bunnies));
  }
  public static int bunny2 (int bunnies){
    if (bunnies == 0){
      return 0;
    } else {
        if (bunnies % 2 == 0){
           return 3 + bunny2(bunnies-1);
      }else{
          return 2 + bunny2(bunnies-1);
        }
    }
  }
}
