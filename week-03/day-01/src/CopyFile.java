import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {
  public static void main(String[] args) {
    String pathString = "01file.txt";
    String pathString2 = "03file.txt";
    Path path1 = Paths.get(pathString);
    Path path2 = Paths.get(pathString2);
    System.out.println(fileCopier(path1, path2));
  }

  public static boolean fileCopier (Path path1, Path path2){
    boolean copyOK = false;
    try{
      Files.copy(path1,path2);
      copyOK = true;
    }catch (IOException e){
      System.out.println(e);
    }
    return copyOK;
  }
}
