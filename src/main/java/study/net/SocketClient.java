package study.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Description:
 * @Author: Mr.Allen
 * @Date: 2021/4/29/22:10
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream out = socket.getOutputStream();
        out.write("你好".getBytes());
        InputStream in = socket.getInputStream();
        byte [] info = new byte[1024];
        int length = in.read(info);
        System.out.println(new String(info));
        socket.close();
    }
}