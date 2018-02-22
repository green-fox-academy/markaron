import java.util.*;

// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Create a method called quoteSwap().

// Also, print the sentence to the output with spaces in between.
// Expected output: "What I cannot create I do not understand."

public class QuoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
        quoteSwap(list);
        System.out.println(quoteSwap2(list));
        quoteSwap3(list);
    }
    public static void quoteSwap(List<String> input) {
        Collections.swap(input, 2, 5);
        for (String output : input) {
          System.out.print(Arrays.toString(new String[]{output}));
      }
    }

    public static List<String> quoteSwap2(List<String> input){
      Collections.swap(input,2,5);
      return input;
    }

    public static void quoteSwap3(List<String> input){
      Collections.swap(input,2,5);
      StringBuilder output = new StringBuilder();
      for ( String s : input){
        output.append(s);
        output.append(" ");
      }
      System.out.println(output.toString());
    }

}
