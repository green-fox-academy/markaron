public class Refactorio {
  public static void main(String[] args) {
    int num= 14;
    System.out.println(factorial(num));
  }

  public static int factorial (Integer num){
    if (num == 0){
      return 1;
    } else {
      return num * factorial(num-1);
    }
  }
}
