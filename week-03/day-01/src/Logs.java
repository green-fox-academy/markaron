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
    //uniqueAddresses(fileName);
    getPostRatio(fileName);
  }

  public static void uniqueAddresses(String fileName) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList());
    Path logFile = Paths.get(fileName);
    try {
      for (String line : Files.readAllLines(logFile)) {
        list.add(line.substring(27, 38));
      }

      Set set = new HashSet(list);
      ArrayList uniqeList = new ArrayList(set);
      System.out.println("The unique list is: " + uniqeList);

    } catch (IOException e) {
      System.out.println(e);
    }
  }

  public static void getPostRatio(String fileName) {
    ArrayList<String> list = new ArrayList<>(Arrays.asList());
    Path logFile = Paths.get(fileName);
    try {
      for (String line : Files.readAllLines(logFile)) {
        list.add(line.substring(41, 45));
      }
      System.out.println(list);

      double get = 0;
      double post = 0;
      for (int i = 0; i <list.size() ; i++) {
        if(list.get(i).contains("GET ")){
          get++;
        }else{
          post++;
        }
      }

      double getRatio = get/list.size();
      double postRatio = post/list.size();

      System.out.println(getRatio);
      System.out.println(postRatio);

    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
