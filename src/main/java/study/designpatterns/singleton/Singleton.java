package study.designpatterns.singleton;

/**
 * @program: java study
 * @description: 单例模式
 * @author: Kelly.Xing
 * @create: 2019-03-31 21:53
 **/
public class Singleton {
    private static Singleton singleton = new Singleton();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int number;
    private String name;

    public static Singleton getSingleton() {
        return singleton;
    }
}
