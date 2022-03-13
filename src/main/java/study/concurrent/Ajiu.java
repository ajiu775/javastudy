package study.concurrent;

public class Ajiu implements Runnable{
    private static Integer count = 0;
    @Override
    public void run() {
        while (true){
            if(count!=10){
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ++count;
                System.out.println(count);
            }else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Ajiu());
        thread1.setName("Ajiu1");
        thread1.start();
        Thread thread = new Thread(()->{
            while(true){
                System.out.println(count);
            }
        });
        thread.setName("AjiuDaemon");
        thread.setDaemon(true);
        thread.start();
        while (count==5){
             break;
        }
    }
}
