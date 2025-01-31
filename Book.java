import java.util.Scanner;
public class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title = title;
		this.author = author;
		this.price = price; 
	}
	public void BookDetails(){
		System.out.println("The book name is: "+title+ " the author of book is: "+author+  " and the price of book is: "+price);
	}
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name of book");
	String title = sc.nextLine();
	System.out.println("Enter the author of book");
	String author = sc.nextLine();
	System.out.println("Enter the price of book");
	double price = sc.nextDouble();
	Book detail = new Book(title , author , price);
	detail.BookDetails();
	}
}
