public class Main {
    public static void main(String[] args) {
        Book a = new Book("Harry Potter and the Sorcerer's Stone", "Lauren Faust", "Mystery/Adventure");
        Book b = new Book("The Shining", "Steven King", "Horror");
        a.printInfo();
        System.out.println();
        b.printInfo();
        Book c = new Book("Percy Jackson and The Lightning Theif","Rick Riordan","Mythology/Adventure");
        System.out.println();
        c.printInfo();
        System.out.println(c.getTitle());
        c.setGenre("Horror");
        System.out.println(c.getGenre());
    }
}
