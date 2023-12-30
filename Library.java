import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Library implements Iterable<Book> {

    ArrayList<Book> books;
    int index;

    public Library() {
        books = new ArrayList<>();
        index = 0;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void getBooks() {
        Iterator<Book> iter = books.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
    }

    public void sortAuthor() {
        AuthorComparator comparator = new AuthorComparator();
        Collections.sort(books, comparator);
    }

    public void sortYear() {
        PublishedYearComparator comparator = new PublishedYearComparator();
        Collections.sort(books, comparator);
    }

    public void sortTitle () {
        TitleComparator comparator = new TitleComparator();
        Collections.sort(books, comparator);
    }

    @Override
    public Iterator<Book> iterator() {
        Iterator<Book> it = new Iterator<Book>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < books.size();
            }

            @Override
            public Book next() {
                return books.get(index++);
            }
        };
        return it;
    }
}