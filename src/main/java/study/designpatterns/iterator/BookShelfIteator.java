package study.designpatterns.iterator;

/**
 * @program: java study
 * @description: work for iterator
 * @author: Kelly.Xing
 * @create: 2019-08-20 09:30
 **/
public class BookShelfIteator implements Iterator {
    private Bookshelf bookshelf;
    private int index;

    public BookShelfIteator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index = 0;

    }

    public boolean hasNext() {
        if (index < bookshelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        Book book = bookshelf.getBookIndex(index);
        index++;
        return book;
    }
}
