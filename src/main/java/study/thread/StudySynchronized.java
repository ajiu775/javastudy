package study.thread;

import java.util.concurrent.*;

/**
 * @program: javastudy
 * @description:
 * @author: Allen
 * @create: 2020-03-30 23:02
 **/
public class StudySynchronized {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,
                10,
                100,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>());

        ThreadEntity threadEntity = new ThreadEntity();
        for (int i = 0; i < 10; i++) {
            threadPoolExecutor.execute(threadEntity);
        }
        threadPoolExecutor.shutdown();
    }
}
