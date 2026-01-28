public class Book {
    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public void printInfo(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
    public String getTitle(){
        return title;
    }
    public String setGenre(String genre){
        this.genre = genre;
        return genre;
    }
    public String getGenre(){
        return genre;
    }
}
