import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    protected void addBook(Book book) {
        books.add(book);
    }

    public int getNumberOfBooks() {
        return books.size();
    }
}