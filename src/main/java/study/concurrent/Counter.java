package study.concurrent;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @program: java study
 * @description: count
 * @author: Allen
 * @create: 2020-11-18 19:01
 **/

public class Counter implements Runnable {
   private  final static AtomicLong atomicLong = new AtomicLong(0);
   private static long count = 0;
    @Override
    public void run() {
       atomicLong.incrementAndGet();
       count++;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            Thread thread1 = new Thread(new Counter());
            Thread thread2= new Thread(new Counter());
            Thread thread3 = new Thread(new Counter());
            Thread thread4= new Thread(new Counter());
            Thread thread5 = new Thread(new Counter());
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            Thread.sleep(1000);
        }
        System.out.print(atomicLong);
        System.out.println(count);
    }
}
