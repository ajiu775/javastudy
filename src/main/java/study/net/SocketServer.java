package study.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Description:
 * @Author: Mr.Allen
 * @Date: 2021/4/29/22:14
 */
public class SocketServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        byte [] info = new byte[1024];
        int length = in.read(info);
        System.out.println(new String(info));
        OutputStream out = socket.getOutputStream();
        out.write("Hello".getBytes());
        socket.close();
        serverSocket.close();
    }
}