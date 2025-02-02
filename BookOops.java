import java.util.Scanner;
public class BookOops{
   private String title;
   private String author;
   private double price;
   public BookOops(){
       this.title = "Harry Potter";
        this.author = "J K Rowling";
        this.price = 50;
  }
    public BookOops(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
 }
    public void bookInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
  }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the title");
       String title = sc.nextLine();
       System.out.println("Enter the name of author");
       String author = sc.nextLine();
       System.out.println("Enter the price");
       double price = sc.nextInt();
       BookOops book1 = new BookOops();
       book1.bookInfo();
       BookOops book2 = new BookOops(title,author,price);
       book2.bookInfo();
   }
}
