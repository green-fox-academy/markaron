public class BlogPost_Main {
  public static void main(String[] args) {
    BlogPost blogPost1 = new BlogPost();
    BlogPost blogPost2 = new BlogPost();
    BlogPost blogPost3 = new BlogPost();

    blogPost1.authorName = "John Doe";
    blogPost1.title = "Lorem Ipsum";
    blogPost1.publicationDate = "2000.05.04";
    blogPost1.text = "Lorem ipsum dolor sit amet.";

    blogPost2.authorName = "Tim Urban";
    blogPost2.title = "Wait but why";
    blogPost2.publicationDate = "2010.10.10";
    blogPost2.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

    blogPost3.authorName = "William Truton";
    blogPost3.title = "Lorem Ipsum";
    blogPost3.publicationDate = "2017.03.28";
    blogPost3.text = "One Engineer Is Trying to Get IBM to Reckon With Trump";

  }


}
