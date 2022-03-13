package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description:
 * @Author: Mr.Allen
 * @Date: 2021/4/18/21:50
 */
public class ThreadPool {

    public static void main(String[] args) {
        ExecutorService es1 = Executors.newSingleThreadExecutor();
        ExecutorService es2 = Executors.newFixedThreadPool(3);
        ExecutorService es3 = Executors.newScheduledThreadPool(5);
        ExecutorService es4 = Executors. newCachedThreadPool();
        Lock lock = new ReentrantLock();


    }
}