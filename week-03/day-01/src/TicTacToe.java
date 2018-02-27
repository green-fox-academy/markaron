import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class TicTacToe {
  public static void main(String[] args) {
    String fileName = "win-x.txt";

    ticTacToe(fileName);
  }
  public static void ticTacToe(String fileName){
    ArrayList<String> list = new ArrayList<>(Arrays.asList());
    Path file1 = Paths.get(fileName);
    try {
      for (String line: Files.readAllLines(file1)) {
        list.add(line);
      }
      System.out.println(list);
    }catch (IOException e){
      System.out.println(e);
    }
  }
}
