package study;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchService;

/**
 * @Description:
 * @Author: Mr.Allen
 * @Date: 2021/11/19/19:25
 */
public class ReadWatchService {


    public static void main(String[] args) throws IOException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        File file = new File("/delete");

        Path parentPath = file.toPath();
        parentPath.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
    }
}