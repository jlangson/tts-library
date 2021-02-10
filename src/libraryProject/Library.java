package libraryProject;

import java.util.ArrayList;
import java.util.List;

public class Library {
//Add the missing implementation to this class

    private String address;
    private List<Book> catalog;

    public Library() {
    }

    public Library(String address) {
        this.address = address;
        this.catalog = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        catalog.add(newBook);
    }

    public static void printOpeningHours() {
        System.out.println("Daily from 9am to 5pm.");
    }

    public void printAddress() {
        System.out.println(this.address);
    }

    public void borrowBook(String title) {
        Book book = findBookByTitle(title);
        if(book.getTitle().equals("")){ //book not found
            System.out.printf("Sorry the book %s is not in our catalog%n", title);
        } else if(book.getBorrowed()){
            System.out.printf("Sorry the book %s is checked out%n", title);
        } else{ //
            System.out.printf("Here is your book %s%n", title);
            book.setBorrowed(true);
        }
        
    }

    public Book findBookByTitle(String title) {
        for (Book book : this.catalog) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                //if this used a for loop there would be an index location
                //so the code could be
                //return this.catalog.get(i);
                //and you wouldn't need the int bookLocation = this.catalog.indexOf(book)
                int bookLocation = this.catalog.indexOf(book);
                return this.catalog.get(bookLocation);
            }
        }
        return new Book(""); //means book not found
    }

}
