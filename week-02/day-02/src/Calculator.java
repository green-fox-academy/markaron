
// Create a simple calculator application which reads the parameters from the prompt
// and prints the result to the prompt.
// It should support the following operations,
// create a method named "calculate()":
// +, -, *, /, % and it should support two operands.
// The format of the expressions must be: {operation} {operand} {operand}.
// Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

// You can use the Scanner class
// It should work like this:

// Start the program
// It prints: "Please type in the expression:"
// Waits for the user input
// Print the result to the prompt
// Exit

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    System.out.println("Hello, let's work wi");
    Scanner in = new Scanner(System.in);
    String[] values = in.nextLine().split("\\s");

    String operator = values[0];
    Double num1 = Double.valueOf(values[1]);
    Double num2 = Double.valueOf(values[2]);
    System.out.println(myCalculator(operator, num1, num2));
  }

  public static double myCalculator(String op, double num1, double num2) {
    double result = 0;
    if (op.equals("+")) {
      result = num1 + num2;
    } else if (op.equals("-")) {
      result = num1 - num2;
    } else if (op.equals("*")) {
      result = num1 * num2;
    } else if (op.equals("/")) {
      result = num1 / num2;
    } else if (op.equals("%")) {
      result = num1 % num2;
    }else{
      System.out.println("Cannot comply, You have entered a wrong operator.");
    }
    return result;
  }
}
