public class Counter {
  public static void main(String[] args) {
  int n = 510;
  recursiveCounter(n);
  }

  public static void recursiveCounter (int n){
    if ( n <= 0){
      System.out.println(0);
      return;
    }else{
      System.out.println(n);
      recursiveCounter(n-1);
    }

  }
}
