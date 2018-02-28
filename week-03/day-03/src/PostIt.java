public class PostIt {
  String backgroundColor;
  String text;
  String textColor;


  public static void main(String[] args) {
    PostIt postIt1 = new PostIt();
    PostIt postIt2 = new PostIt();
    PostIt postIt3 = new PostIt();


    postIt1.backgroundColor = "Orange";
    postIt1.text = "Idea 1";
    postIt1.textColor = "blue";

    postIt2.backgroundColor="pink";
    postIt2.text = "Awsome";
    postIt2.textColor = "black";

    postIt3.backgroundColor= "yellow";
    postIt3.text = "Superb";
    postIt3.textColor = "green";

  }
}