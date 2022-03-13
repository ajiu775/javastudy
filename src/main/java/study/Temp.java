package study;


import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/**
 * @program: java study
 * @description:
 * @author: Allen
 * @create: 2020-11-11 09:29
 **/

public class Temp {
    public static void main(String[] args) throws IOException, InterruptedException {
//        WatchService watchService = FileSystems.getDefault().newWatchService();
//        Paths.get("aa").register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
//        WatchKey wk = watchService.take();
//        wk.reset();
        while(true){
            Thread.sleep(1);
            System.out.println("1");
        }
    }


}
