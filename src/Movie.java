import org.w3c.dom.ls.LSOutput;

public class Movie {
    public String name;
    public double rating;
    public double duration;
    public String genre;
    public int year;

    public Movie(String name, double rating, double duration, String genre, int year) {
        this.name = name;
        this.rating = rating;
        this.duration = duration;
        this.genre = genre;
        this.year = year;
    }

    public void printInfo() {
        System.out.println("====================");
        System.out.println("Name: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + duration);
        System.out.println("Genre: " + genre);
        System.out.println("Year: " + year);
        System.out.println("====================");
    }

    public boolean isLongMovie() {
        if (duration > 120) {
            return true;
        } else return false;
    }
    public double getRating(){return rating;}
    public String getName(){return name;}
    public double getDuration(){return duration;}
    public String getGenre(){return genre;}
    public int getYear(){return year;}
}
