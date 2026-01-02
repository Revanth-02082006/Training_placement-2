import java.util.ArrayList;

class Book {
    String title;
    boolean isIssued;

    Book(String title) {
        this.title = title;
        this.isIssued = false;
    }
}

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(new Book(title));
    }

    public void issueBook(String title) {
        for (Book b : books) {
            if (b.title.equals(title) && !b.isIssued) {
                b.isIssued = true;
                System.out.println("Book issued: " + title);
                return;
            }
        }
        System.out.println("Book not available.");
    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.title.equals(title) && b.isIssued) {
                b.isIssued = false;
                System.out.println("Book returned: " + title);
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook("Java Basics");
        lib.addBook("Data Structures");
        lib.issueBook("Java Basics");
        lib.returnBook("Java Basics");
    }
}
