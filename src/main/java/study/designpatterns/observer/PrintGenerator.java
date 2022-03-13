package study.designpatterns.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @program: javastudy
 * @description: 观察者模式生产者父类
 * @author: Kelly.Xing
 * @create: 2019-03-22 22:49
 **/
public abstract class PrintGenerator {
    private ArrayList observerList = new ArrayList();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        Iterator observerIterator = observerList.iterator();
        while (observerIterator.hasNext()) {
            Observer observer = (Observer) observerIterator.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}
