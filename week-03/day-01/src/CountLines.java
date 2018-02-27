import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {

    String pathString = "my-file.txt";
    countLines(pathString);
  }

  public static void countLines(String fileName) {
    Path file1 = Paths.get(fileName);
    int lineNum = 0;
    try {
      System.out.println(Files.lines(file1).count());
    } catch (IOException e) {
      e.printStackTrace();
    }
    }
  }

