public class Animal {
  int hunger;
  int thirst;

  public Animal () {
    hunger = 50;
    thirst = 50;
  }

  public void eat(){
    hunger--;
  }
  public  void drink(){
    thirst--;
  }
  public void play(){
    hunger++;
    thirst++;
  }

  public static void main(String[] args) {
    Animal craw = new Animal();
    System.out.println(craw.thirst);
    System.out.println(craw.hunger);
    craw.drink();
    craw.drink();
    System.out.println(craw.thirst);
    craw.play();
    System.out.println(craw.hunger);
  }
}
