
// EXERCISE 4 : LIBRARY 

class Library {
    String[] books;
    int no_Book;

    Library() {
        this.books = new String[10];
        this.no_Book = 0;
    }

    public void Add_book(String book) {
        this.books[this.no_Book] = book;
        no_Book++;
        System.out.println(book + " hasbeen added..!");
    }

    void showAvailabkeBooks() {
        System.out.println("Available books are :");
        for (String book : this.books) {
            if (book != null) {
                System.out.println("* " + book);
                continue;
            }
        }
    }

    void Issu_book(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("The book has been isued..!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("Book deos not exit..!");
    }

    void returnbook(String book) {
        this.books[no_Book] = book;
        Add_book(book);
    }

}

public class exercise_4 {
    public static void main(String[] args) {

        Library lib = new Library();
        lib.Add_book("c");
        lib.Add_book("c++");
        lib.Add_book("Java");
        lib.Add_book("Python");
        lib.showAvailabkeBooks();

        lib.Issu_book("Java");
        lib.showAvailabkeBooks();

        lib.returnbook("Java");
        lib.showAvailabkeBooks();
    }
}