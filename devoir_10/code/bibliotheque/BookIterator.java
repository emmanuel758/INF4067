import java.util.List;

public class BookIterator implements Iterator {
    private List<Book> books;
    private int position;

    public BookIterator(List<Book> books) {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Book book = books.get(position);
            position++;
            return book;
        }
        return null;
    }
}