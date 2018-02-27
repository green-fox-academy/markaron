// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Logs {
  public static void main(String[] args) {
    String fileName = "logs.txt";
    uniqeAddresses(fileName);
  }

  public static void uniqeAddresses (String fileName){
    ArrayList<String> list = new ArrayList<>(Arrays.asList());
    Path logFile = Paths.get(fileName);
    try {
      for (String line: Files.readAllLines(logFile)) {
        list.add(line.substring(27,38));
      }
      System.out.println(list);

      Set set = new HashSet(list);
      ArrayList uniqeList = new ArrayList(set);
      System.out.println("The unique list is: " + uniqeList);

    }catch (IOException e){
      System.out.println(e);
    }
  }
}
