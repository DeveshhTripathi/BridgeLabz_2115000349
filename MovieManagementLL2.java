class Movie{
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;

    public Movie(String title, String director, int year, double rating){
      this.title = title;
      this.director = director;
      this.year = year;
      this.rating = rating;
      this.next = null;
      this.prev = null;
  }
}
class MovieList{
    private Movie head;
    private Movie tail;
    public void addMovieAtBeginning(String title, String director, int year, double rating){
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null){
            head = tail = newMovie;
            return;
        }
        newMovie.next = head;
        head.prev = newMovie;
        head = newMovie;
    }
    public void addMovieAtEnd(String title, String director, int year, double rating){
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null){ 
            head = tail = newMovie;
            return;
      }
        tail.next = newMovie;
        newMovie.prev = tail;
        tail = newMovie;
    }
    public void addMovieAtPosition(String title, String director, int year, double rating, int position){
        if (position <= 1){
            addMovieAtBeginning(title, director, year, rating);
            return;
      }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;
        for (int i = 1; temp != null && i < position - 1; i++){
            temp = temp.next;
     }
        if (temp == null || temp.next == null){
            addMovieAtEnd(title, director, year, rating);
            return;
        }
        newMovie.next = temp.next;
        temp.next.prev = newMovie;
        temp.next = newMovie;
        newMovie.prev = temp;
    }
    public void removeMovie(String title){
        Movie temp = head;
        while (temp != null){
            if (temp.title.equalsIgnoreCase(title)){
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }
    public void searchMovie(String director, double rating){
        Movie temp = head;
        while (temp != null){
            if (temp.director.equalsIgnoreCase(director) || temp.rating == rating) {
                System.out.println("Found Movie: " + temp.title + " directed by " + temp.director);
            }
            temp = temp.next;
        }
    }
    public void updateMovieRating(String title, double newRating){
        Movie temp = head;
        while (temp != null){
            if (temp.title.equalsIgnoreCase(title)){
                temp.rating = newRating;
                System.out.println("Updated rating for " + title + " to " + newRating);
                return;
            }
            temp = temp.next;
      }
        System.out.println("Movie not found.");
  }
    public void displayMoviesForward(){
        Movie temp = head;
        while (temp != null){
            System.out.println(temp.title + " (" + temp.year + ") - " + temp.director + " - Rating: " + temp.rating);
            temp = temp.next;
   }
 }
    public void displayMoviesReverse(){
        Movie temp = tail;
        while (temp != null){
            System.out.println(temp.title + " (" + temp.year + ") - " + temp.director + " - Rating: " + temp.rating);
            temp = temp.prev;
   }
  }
}
public class MovieManagementLL2{
    public static void main(String[] args){
        MovieList movieList = new MovieList();
        movieList.addMovieAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movieList.addMovieAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movieList.addMovieAtBeginning("The Godfather", "Francis Ford Coppola", 1972, 9.2);
        movieList.addMovieAtPosition("Pulp Fiction", "Quentin Tarantino", 1994, 8.9, 2);
        System.out.println("Movies in Forward Order:");
        movieList.displayMoviesForward();
        System.out.println("\nMovies in Reverse Order:");
        movieList.displayMoviesReverse();
        System.out.println("\nSearching for movies by Christopher Nolan:");
        movieList.searchMovie("Christopher Nolan", 0);
        System.out.println("\nUpdating rating for Inception:");
        movieList.updateMovieRating("Inception", 9.0);
        movieList.displayMoviesForward();
        System.out.println("\nRemoving The Godfather:");
        movieList.removeMovie("The Godfather");
        movieList.displayMoviesForward();
  }
}
