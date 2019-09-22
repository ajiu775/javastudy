package study.designpatterns.observer;

/**
 * @program: javastudy
 * @description: 启动类
 * @author: Kelly.Xing
 * @create: 2019-03-31 16:08
 **/
public class ObserverRun {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Observer numberObserver = new NumberObserver();
        Observer graphObserver = new GraphObserver();
        numberGenerator.addObserver(numberObserver);
        numberGenerator.addObserver(graphObserver);
        numberGenerator.execute();
    }

}
