import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {

    String pathString = "file.txt";
    System.out.println(countLines(pathString));

  }
  public static long countLines(String fileName) {
    Path file1 = Paths.get(fileName);
    long counter = 0;
    try {
      counter = Files.lines(file1).count();
    } catch (NoSuchFieldException | IOException e) {
      e.printStackTrace();
      return counter;
    }
    return counter;
    }
  }

