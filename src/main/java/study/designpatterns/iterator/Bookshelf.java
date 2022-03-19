package study.designpatterns.iterator;

/**
 * @program: javastudy
 * @description: As a subCollection
 * @author: Kelly.Xing
 * @create: 2019-08-19 16:35
 **/
public class Bookshelf implements Aggregate {

    private Book[] books;
    private int lastIndex = 0;

    public Bookshelf(int maxSize) {
        books = new Book[maxSize];

    }

    public Book getBookIndex(int index) {
        return books[index];

    }

    public void addBook(Book book) {
        books[lastIndex] = book;
        lastIndex++;

    }

    public int getLength() {
        return lastIndex;
    }

    public Iterator getIterator() {
        return new BookShelfIteator(this);
    }
}
