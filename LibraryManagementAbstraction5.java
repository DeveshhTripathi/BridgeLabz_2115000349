abstract class LibraryItem{
    private String itemId;
    private String title;
    private String author;
    public LibraryItem(String itemId, String title, String author){
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public abstract int getLoanDuration();
    public void getItemDetails(){
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
   }
}
interface Reservable{
    void reserveItem();
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable{
    private boolean isReserved;
    public Book(String itemId, String title, String author){
        super(itemId, title, author);
        this.isReserved = false;
  }
    public int getLoanDuration(){
        return 7; // Books can be borrowed for 7 days
    }
    public void reserveItem(){
        if (!isReserved){
            isReserved = true;
            System.out.println("Book reserved successfully.");
        }else{
            System.out.println("Book is already reserved.");
     }
 }
    public boolean checkAvailability(){
        return !isReserved;
    }
}
class Magazine extends LibraryItem{
    public Magazine(String itemId, String title, String author){
        super(itemId, title, author);
    }
    public int getLoanDuration(){
        return 5; // Magazines can be borrowed for 5 days
    }
}
class DVD extends LibraryItem implements Reservable{
    private boolean isReserved;
    public DVD(String itemId, String title, String author){
        super(itemId, title, author);
        this.isReserved = false;
    }
    public int getLoanDuration(){
        return 3; // DVDs can be borrowed for 3 days
    }
    public void reserveItem(){
        if (!isReserved){
            isReserved = true;
            System.out.println("DVD reserved successfully.");
        }else{
            System.out.println("DVD is already reserved.");
    }
 }
    public boolean checkAvailability(){
        return !isReserved;
  }
}
public class LibraryManagementAbstraction5{
    public static void main(String[] args){
        LibraryItem book = new Book("B101", "The Great Gatsby", "F. Scott Fitzgerald");
        LibraryItem magazine = new Magazine("M202", "National Geographic", "Editorial Team");
        LibraryItem dvd = new DVD("D303", "Inception", "Christopher Nolan");
        book.getItemDetails();
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days\n");
        magazine.getItemDetails();
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days\n");
        dvd.getItemDetails();
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days\n");
    }
}

