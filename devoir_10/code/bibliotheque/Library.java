import java.util.ArrayList;
import java.util.List;

public class Library implements ICollection {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public Iterator createIterator() { 
        return new BookIterator(books);
    }
} 
