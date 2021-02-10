package libraryProject;

public class Book {

    private String title;
    private boolean borrowed = false;

    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
    }

    // Marks the book as rented
    public void setBorrowed(boolean borrowed){
        this.borrowed = borrowed;
    }

    // Returns true if the book is rented, false otherwise
    public boolean getBorrowed() {
        // Implement this method
        return borrowed;
    }

    // Returns the title of the book
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", borrowed=" + borrowed + '}';
    }
    
    

}
