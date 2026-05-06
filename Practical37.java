class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks;

    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    public void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Available books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class Practical37 {
    public static void main(String[] args) {
        System.out.println("Vrunda Vaghela (250393107016)\n");
        Library lib = new Library(3);

        try {
            lib.issueBook(2);
            lib.issueBook(2);
        }
        catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}