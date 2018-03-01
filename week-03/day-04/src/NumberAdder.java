public class NumberAdder {
  public static void main(String[] args) {
    int n = 10;
    System.out.println(adder(n));
  }
  public static int adder(int n){
    if (n == 1){
      return 1;
    }else{
      return n + adder(n-1);
    }
  }
}
