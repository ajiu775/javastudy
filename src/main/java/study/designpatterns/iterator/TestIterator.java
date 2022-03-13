package study.designpatterns.iterator;

/**
 * @program: javastudy
 * @description: run Iterator pattren
 * @author: Kelly.Xing
 * @create: 2019-08-20 09:46
 **/
public class TestIterator {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf(6);
        bookshelf.addBook(new Book("The best us"));
        bookshelf.addBook(new Book("Thinking in Java"));
        bookshelf.addBook(new Book("Mysql"));
        bookshelf.addBook(new Book("Redis"));
        bookshelf.addBook(new Book("Java Virtual Machine"));
        bookshelf.addBook(new Book("Springboot"));
        Iterator iterator = bookshelf.getIterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getBookName());

        }
    }
}
