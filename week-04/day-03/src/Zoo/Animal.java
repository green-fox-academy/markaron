package Zoo;
import flyable.Flyable;

abstract public class Animal implements Flyable{
  String name;
  int age;

  abstract public String getName ();

  abstract public String breed();
}
