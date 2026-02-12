public class Main {
    public static void main(String[] args) {
//        Book a = new Book("Harry Potter and the Sorcerer's Stone", "Lauren Faust", "Mystery/Adventure");
//        Book b = new Book("The Shining", "Steven King", "Horror");
        Book c = new Book("Percy Jackson and The Lightning Thief","Rick Riordan","Mythology/Adventure");
        LibrarySimulator JoobooInternationalLibrary = new LibrarySimulator();
        JoobooInternationalLibrary.addBook("Hatchet","Gary Paulsen","Survival");
        JoobooInternationalLibrary.addBook("Tell Tale Heart", "Edgar Allen Poe", "Mystery");
        JoobooInternationalLibrary.printCatalog();
    }
}
