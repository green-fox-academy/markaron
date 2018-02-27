// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteMultipleLines {
  public static void main(String[] args) {
    String word = "apple";
    String pathString = "my-new-file.txt";
    Path path1 = Paths.get(pathString);
    int num = 5;
    fileWriter(path1,word,num);

  }

  public static void fileWriter (Path path1, String word, int num){
    //File file1 = new File (path1);
    ArrayList<String> list = new ArrayList<>(Arrays.asList(word));
    try{
      for (int i = 1; i < num; i++) {
        Files.write(path1,list, StandardOpenOption.APPEND);
      }
      for (String line: Files.readAllLines(path1)){
        System.out.println(line);
      }
    }catch (IOException e){

    }
  }
}
