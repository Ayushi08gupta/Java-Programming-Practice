public class BookDetails {
  public static class Book{
    String title;
    String author;
    int price;
    public Book( String title,String author,int price){
      this.author = author;
      this.title = title;
      this.price = price;
    }
    public void DisplayDetails(){
        System.out.println("Name of the Book is : " + title);
        System.out.println("Author of the Book is : " + author);
        System.out.println("Price of the Book is : " + price);
    }
  }
  public static void main(String args[]){
      Book b1 = new Book("The Overstory","Richard Powers",250 );
      Book b2 = new Book("catch -22", "Joseph Heller", 200);
      Book b3 = new Book("Oliver Twist", "Charles Dickness", 199);
      System.out.println("============ Book 1 =================");
      b1.DisplayDetails();
      System.out.println();
      System.out.println("============ Book 2 =================");
      b2.DisplayDetails();
      System.out.println();
      System.out.println("============ Book 3 =================");
      b3.DisplayDetails();
      System.out.println();
  }
}
