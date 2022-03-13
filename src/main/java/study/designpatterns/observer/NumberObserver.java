package study.designpatterns.observer;

/**
 * @program: java study
 * @description: 数字观察者
 * @author: Kelly.Xing
 * @create: 2019-03-31 15:57
 **/
public class NumberObserver implements Observer {
    public void update(PrintGenerator printGenerator) {
        System.out.println("NumberObserver:" + printGenerator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("thread sleep exception");
        }
    }
}
