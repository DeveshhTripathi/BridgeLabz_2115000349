import java.util.Scanner;
public class Book{
    public static class Book{
        public String ISBN;
        protected String title;
        private String author;
        public Book(String isbn, String title, String author){
            this.ISBN = isbn;
            this.title = title;
            this.author = author;
        }
        public String getAuthor(){
            return author;
        }
        public void setAuthor(String author){
            this.author = author;
        }
        public String getTitle(){
            return title;
        }
    }
    public static class EBook extends Book{
        private String format;
        public EBook(String isbn, String title, String author, String format) {
            super(isbn, title, author);
            this.format = format;
        }
        public String getFormat(){
            return format;
        }
        public void displayISBN(){
            System.out.println("ISBN: " + ISBN);
        }
        public void displayTitle(){
            System.out.println("Title: " + title);
        }
        public void displayAuthor() {
            System.out.println("Author: " + getAuthor());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Book ISBN:");
        String bookISBN = scanner.nextLine();
        System.out.println("Enter Book Title:");
        String bookTitle = scanner.nextLine();
        System.out.println("Enter Book Author:");
        String bookAuthor = scanner.nextLine();
        Book b1 = new Book(bookISBN, bookTitle, bookAuthor);
        System.out.println("\nEnter EBook ISBN:");
        String ebookISBN = scanner.nextLine();
        System.out.println("Enter EBook Title:");
        String ebookTitle = scanner.nextLine();
        System.out.println("Enter EBook Author:");
        String ebookAuthor = scanner.nextLine();
        System.out.println("Enter EBook Format:");
        String ebookFormat = scanner.nextLine();
        EBook e1 = new EBook(ebookISBN, ebookTitle, ebookAuthor, ebookFormat);
        System.out.println("\nBook Details:");
        System.out.println("ISBN: " + b1.ISBN);
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("\nEBook Details:");
        e1.displayISBN();
        e1.displayTitle();
        e1.displayAuthor();
        System.out.println("Format: " + e1.getFormat());
    }
}
