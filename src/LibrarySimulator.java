import java.util.ArrayList;
public class LibrarySimulator {
    ArrayList<Book> bookList = new ArrayList<Book>();
    ArrayList<Movie> movieList = new ArrayList<Movie>();
    public LibrarySimulator(){
        Book a = new Book("Harry Potter","J.K Rowling","Adventure");
        bookList.add(a);
        Movie b = new Movie("Back to the Future",5.0,96,"Adventure",1985);
        movieList.add(b);
        Book c = new Book("Magic School Bus","Joanna Cole","Adventure");
        bookList.add(c);
        Movie d = new Movie("Finding Nemo",5.0,101,"Adventure",2003);
        movieList.add(d);
    }
    public void printCatalog(){
        for(int i = 0; i < bookList.size(); i++){
            Book x = bookList.get(i);
            x.printInfo();
        }
        for(int y = 0; y < movieList.size(); y++){
            Movie x =   movieList.get(y);
            x.printInfo();
        }
    }
    public void addBook(String title, String author, String genre){
        Book e = new Book("The Raven", "Edgar Allan Poe", "Mystery");
        bookList.add(e);
    }
    public void addMovie(String title, String rating, String duration, String genre, String year){
        Movie f = new Movie("Smile",6.7,140,"Horror",2020);
        movieList.add(f);
    }
    public void borrowBook(Book title, Book author, Book genre){
        bookList.remove(title);
        bookList.remove(author);
        bookList.remove(genre);
    }
}
