import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TicTacToe {
  public static void main(String[] args) {
    String fileName = "win-x.txt";

    ticTacToe(fileName);
  }
  public static void ticTacToe(String fileName){
    Path file1 = Paths.get(fileName);
    try {
      for (String line: Files.readAllLines(file1)) {
        System.out.println(line);
      }
    }catch (IOException e){
      System.out.println(e);
    }
  }
}
