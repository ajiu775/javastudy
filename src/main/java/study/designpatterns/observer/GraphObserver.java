package study.designpatterns.observer;

/**
 * @program: javastudy
 * @description: 图形观察者
 * @author: Kelly.Xing
 * @create: 2019-03-31 16:05
 **/
public class GraphObserver implements Observer {
    public void update(PrintGenerator printGenerator) {
        System.out.println("GraphObserver:");
        int count =printGenerator.getNumber();
        for (int i = 0; i <count; i++) {
            System.out.println("**");
        }
        System.out.println(" ");
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("thread sleep exception");
        }
    }
}
