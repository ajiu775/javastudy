package study.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @program: java study
 * @description: study nio
 * @author: Allen
 * @create: 2020-04-18 14:20
 **/

public class Nio {

    public static void main(String[] args) throws Exception {
        // 构造一个传统的文件输出流
        FileOutputStream out = new FileOutputStream("F:\\development\\tmp\\hello.txt");
        // 通过文件输出流获取到对应的FileChannel，以NIO的方式来写文件
        FileChannel channel = out.getChannel();
        // 将数据写入到Buffer中
        ByteBuffer buffer = ByteBuffer.wrap("hello world".getBytes());
        // 通过FileChannel管道将Buffer中的数据写到输出流中去，持久化到磁盘中去
        channel.write(buffer);
        channel.close();
        out.close();
        String a = new StringBuffer("aa").toString();

    }
}

