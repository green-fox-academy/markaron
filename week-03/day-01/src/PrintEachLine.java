import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintEachLine {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList("black", "gray", "white","red","blue"));
    String pathString = "my-file.txt";
    Path path1 = Paths.get(pathString);
    File file1 = new File (pathString);
    try{
      if (!file1.exists()){
        file1.createNewFile();
      }
      Files.write(path1,list);
      for (String line: Files.readAllLines(path1)){
        System.out.println(line);
      }
    }catch (IOException e){
      e.printStackTrace();
      System.out.println("Unable to read file: " + pathString);
    }
  }
}
