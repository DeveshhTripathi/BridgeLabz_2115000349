import java.util.Scanner;
public class Book2{
	private static String libraryName ="Shiva Library";
	private String title;
	private String author;
	private final int isbn;
	public Book2(String title,String author,int isbn){
	this.title = title;
	this.author = author;
	this.isbn = isbn;
	}
	public static void displayLibraryName(){
		System.out.println("The name of library is "+libraryName);
	}
	public void displayDetails(){
	if(this instanceof Book2){
	System.out.println("Title of book is "+title);
	System.out.println("Author is "+author);
	System.out.println("Isbn number is "+isbn);
	}
}
	public static void main(String args[]){
	Book2 obj1 = new Book2("Harry Potter","J K rowling",1234);
	Book2 obj2 = new Book2("Marvel","Jack",1144);
	Book2.displayLibraryName();
	obj1.displayDetails();
	obj2.displayDetails();	
	}
}

