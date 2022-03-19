package study.designpatterns.iterator;


/**
 * As a looper to do foreach
 */

public interface Iterator {
    boolean hasNext();

    Object next();
}
