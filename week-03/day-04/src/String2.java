public class String2 {
  public static void main(String[] args) {
    String word = "axaxaxax";
    int counter = 0;
    String tempWord = "";
    System.out.println(xToy(word, counter, tempWord));
  }

  public static String xToy (String word, int counter, String tempWord){
    if(counter == word.length()){
      return tempWord;
    }else if (word.charAt(counter) == 'x'){
    }else{
      tempWord += word.charAt(counter);
    }
    counter++;
    return xToy(word,counter,tempWord);
  }
}
