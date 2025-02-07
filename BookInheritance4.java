class Book{
	protected String title;
	protected int publicationYear;

	public Book(String title , int publicationYear){
	this.title = title;
	this.publicationYear = publicationYear;
	}
	
	public void displayInfo(){
		System.out.println("Title : "+title + " year of publication: " +publicationYear);
	}
}
class Author extends Book{
	protected String author;
	protected String bio;
	
	public Author(String title , String author , String bio, int publicationYear){
		super(title,publicationYear);
		this.author = author;
		this.bio = bio;
	}

	public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author + ", Bio: " + bio);
    }
}
public class BookInheritance4{
	public static void main(String args[]){
		Book obj =new Book("Harry Potter" , 1992);
		obj.displayInfo();
		Book A1 = new Author("Harry Potter" , "J K Rowling" , "Famous author who wrote book Harry Potter " , 1992);
		A1.displayInfo();
	}
}
