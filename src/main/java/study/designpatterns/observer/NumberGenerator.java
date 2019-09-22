package study.designpatterns.observer;

import java.util.Random;

/**
 * @program: java study
 * @description: 数字生产者类
 * @author: Kelly.Xing
 * @create: 2019-03-31 15:52
 **/
public class NumberGenerator extends PrintGenerator {
    Random random = new Random();
    private int number;

    public int getNumber() {
        return number;
    }

    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(50);
            notifyObserver();
        }
    }
}

