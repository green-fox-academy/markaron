public class Counter {
  int myValue;
  int initalValue;

  public Counter (int initalValue){
    this.initalValue = initalValue;
  myValue = initalValue;
  }
  public Counter (){
    myValue = 0;
    initalValue = 0;
  }

  public void add (int num){
    myValue += num;
  }
  public void add (){
    myValue++;
  }
  public int get (){
    return myValue;
  }
  public int reset (){
    return myValue = initalValue;
  }

  public static void main(String[] args) {
    Counter m = new Counter(7);
    System.out.println(m.myValue);
  }
}
