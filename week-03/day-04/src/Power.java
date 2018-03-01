public class Power {
  public static void main(String[] args) {
    int n = 4;
    int base = 3;
    System.out.println(powerPlay(n,base));
  }

  public static int powerPlay(int n, int base){
    if (n == 0){
      return 1;
    }else{
      return base * powerPlay(n-1,base);
    }
  }
}
