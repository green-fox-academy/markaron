import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {

    String pathString = "file.txt";
    countLines(pathString);

  }
  public static void countLines(String fileName) {
    Path file1 = Paths.get(fileName);
    long counter = 0;
    try {
      for(String line: Files.readAllLines(file1)){
        counter++;
      }
      System.out.println(counter);
      } catch (IOException e) {
      e.printStackTrace();
      System.out.println("0");
    }
    }
  }

