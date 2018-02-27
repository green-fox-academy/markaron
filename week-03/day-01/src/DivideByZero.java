import java.util.Scanner;

public class DivideByZero {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();

    System.out.println(divider(num));
  }
  public static int divider (int num){
    try{
      num = 10 / num;
    } catch (ArithmeticException e){
      System.out.println("fail");
    }
    return num;
  }
}
