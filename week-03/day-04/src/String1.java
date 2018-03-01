public class String1 {
  public static void main(String[] args) {
    String word = "axaxaxax";
    int n = 0;
    xToy(word);
  }

  public static void xToy (String word, int n){
    if(!word.contains("x")){
      System.out.println("no x-es");
    }else {
      if (word.contentEquals("x")){
        word.replace("x","y");
        System.out.println(word.charAt(n));
    }
    }
  }
}
