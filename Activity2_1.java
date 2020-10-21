package Activity1;

//Abstract class
abstract class Book1 {
  String title;
  //Abstract method
  abstract void setTitle(String s);
  
  //Concrete method
  String getTitle() {
      return title;
  }
}

class MyBook extends Book1 {
  //Define abstract method
  public void setTitle(String s) {
      title = s;
  }
}

public class Activity2_1 {
  
  public static void main(String []args) {
      //Initialize title of the book
      String title = "Hover Racer";
      //Create object for MyBook
      Book newNovel = new MyBook();
      //Set title
      newNovel.setTitle(title);
      
      //Print result
      System.out.println("The title is: " + newNovel.getTitle());
  }
}
