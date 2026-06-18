class Book {
    int bookId;
    String title;
    String author;
    double price;
    Book(int id, String t, String a, double p) {
        bookId = id;
        title = t;
        author = a;
        price = p;
    }
    void displayBookInfo() {
        System.out.println("Book ID   : " + bookId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Price     : " + price);
    }
}
public class BookDetails {
    public static void main(String[] args) {
        Book b1 = new Book(101, "The Vampire Diaries", "L.J. Smith", 999.50);
        b1.displayBookInfo();
    }
}
