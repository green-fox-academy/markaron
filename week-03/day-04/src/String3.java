public class String3 {
  public static void main(String[] args) {
    String word = "axaxaxax";
    int counter = 0;
    String tempWord = "";
    System.out.println(xToY(word, counter, tempWord));
  }

  public static String xToY (String word, int counter, String tempWord){
    if(counter == word.length()){
      return tempWord;
    }else{
      tempWord += "*" + word.charAt(counter);
      }
    counter++;
    return xToY(word,counter,tempWord);
  }
}
