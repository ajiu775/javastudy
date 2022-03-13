package study.designpatterns.iterator;

/**
 * @program: java study
 * @description: entity
 * @author: Kelly.Xing
 * @create: 2019-08-19 16:36
 **/
public class Book {
    private String bookName;
    private String author;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
