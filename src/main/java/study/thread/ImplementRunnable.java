package study.thread;

/**
 * @program: java study
 * @description: implement runnable for using thread
 * @author: Kelly.Xing
 * @create: 2019-03-19 00:29
 **/
public class ImplementRunnable {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
        while (true) {
            System.out.println("我是主线程");
        }
    }

}

class MyThread implements Runnable {
    public void run() {
        while (true) {
            System.out.println("我是另外一个线程");
        }
    }
}