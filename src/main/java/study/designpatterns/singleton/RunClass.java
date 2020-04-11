package study.designpatterns.singleton;

/**
 * @program: javastudy
 * @description: 运行类
 * @author: Kelly.Xing
 * @create: 2019-03-31 21:59
 **/
public class RunClass {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        s1.setNumber(1);
        s1.setName("我是第一个来的");
        s2.setNumber(2);
        s2.setName("由于是单例模式产生，所以我覆盖了第一个来的人的设置");
        System.out.println("s1:" + s1.getNumber() + s1.getName());
    }
}
