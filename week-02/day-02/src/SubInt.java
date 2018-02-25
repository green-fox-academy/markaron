//  Create a function that takes a number and a list of numbers as a parameter
//  Returns the indeces of the numbers in the list where the first number is part of
//  Returns an empty list if the number is not part any of the numbers in the list

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubInt {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    List<Integer> list = Arrays.asList(1,34,23,2,15,2,53);
    subInt(num,list);


  }

  public static void subInt (int num, List<Integer> list){
   String stringList = list.toString();
   int index = list.indexOf(num);
    for (int i = 0; i < stringList.length(); i++) {
      System.out.println(index);
      index = list.indexOf(num);
    }
   }
  }

