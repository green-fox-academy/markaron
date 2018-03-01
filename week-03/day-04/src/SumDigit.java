public class SumDigit {
  public static void main(String[] args) {
    int n = 324;
    System.out.println(digitSummer(n));
  }

  public static int digitSummer(int n){
    if (n < 10){
      return n;
    }else {
      return (n % 10) + digitSummer(n/10);
    }
  }

}
