public class Student {

  public void learn(){
  }

  public void question (Teacher teacher){
    teacher.answer();
  }

  public static void main(String[] args) {
    Teacher teacher1 = new Teacher();
    Student student1 = new Student();
    student1.question(new Teacher());
  }
}
