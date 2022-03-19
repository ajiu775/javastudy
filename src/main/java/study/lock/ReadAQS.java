package study.lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReadAQS implements Runnable{
    protected  static ReentrantLock reentrantLock = new ReentrantLock(true);
    private static int a = 0;
    public static void main(String[] args) {
        for (int i = 0 ; i<10000;i++){
            Thread thread = new Thread(new ReadAQS());
            Thread thread1 = new Thread(new ReadAQS());
            thread.start();
            thread1.start();
        }

    }

    @Override
    public void run() {
        reentrantLock.lock();
        a++;
        System.out.println(a);
        //reentrantLock.unlock();
    }
}
