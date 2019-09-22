package study.thread;

/**
 * @program: java study
 * @description: new Thread() for using thread
 * @author: Kelly.Xing
 * @create: 2019-03-19 00:28
 **/
public class CreateThread {

    public static void main(String[] args) {
        Mythread mythread = new Mythread();
        mythread.start();
        while (true) {
            System.out.println("我是主线程");
        }
    }
}

class Mythread extends Thread {
    public void run() {
        while (true) {
            System.out.println("我是另外一个线程");
        }
    }
}
