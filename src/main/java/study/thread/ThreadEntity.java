package study.thread;

/**
 * @program: javastudy
 * @description:
 * @author: Allen
 * @create: 2020-03-30 23:04
 **/
public class ThreadEntity extends Thread {
    private static int count;

    public ThreadEntity() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void add() {
        count++;
        System.out.println(count);
    }

    public void run() {
        add();
    }
}
