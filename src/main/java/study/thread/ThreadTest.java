package study.thread;

/**
 * @program: javastudy
 * @description:
 * @author: Allen
 * @create: 2020-09-24 11:08
 **/

public class ThreadTest extends Thread {
    public void run() {
        System.out.println("In run");
        yield();
        System.out.println("Leaving run");
    }
    public static void main(String []argv) {
        (new ThreadTest()).start();
    }
}