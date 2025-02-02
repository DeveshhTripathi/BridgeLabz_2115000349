import java.util.Scanner;
class BorrowBookOops{
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    public BorrowBookOops(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true;
   	}
    	public boolean borrowBook(){
        if(isAvailable){
         isAvailable = false;
         System.out.println("You have successfully borrowed: " + title);
        return true;
        }else{
            System.out.println("Sorry, this book is currently unavailable.");
            return false;
        }
    	}
   	public void returnBook(){
        isAvailable = true;
        System.out.println("You have successfully returned: " + title);
    	}	
    	public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: "+(isAvailable ? "Available" : "Not Available"));
    	}
    	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name of book ,its author name ,and its price repectively");
	String title = sc.nextLine();
	String author = sc.nextLine();
	sc.nextLine();
	double price = sc.nextDouble();
        BorrowBookOops book1 = new BorrowBookOops(title,author,price);
        book1.displayDetails();
        book1.borrowBook();
        book1.displayDetails();
        book1.returnBook();
        book1.displayDetails();
  }
}
