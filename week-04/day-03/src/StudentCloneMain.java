public class StudentCloneMain {
  public static void main(String[] args) throws CloneNotSupportedException{
    Student john = new Student("John",12, "both"," the street");
    Student john2 =  (Student) john.clone();

    john2.introduce();
  }
}
