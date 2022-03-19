package study.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @program: java study
 * @description: study socket
 * @author: Allen
 * @create: 2020-04-17 14:50
 **/

public class AjiuServer {
    private BufferedReader bufferedReader;
    private ServerSocket serverSocket;
    private Socket socket;

    void getServer() {
        try {
            serverSocket = new ServerSocket(1223);
            System.out.println("服务端套接字已经创建");
            while (true) {
                socket = serverSocket.accept();
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getClientInfo();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getClientInfo() {

        try {
            while (true) {
                System.out.println("客户端信息:" + bufferedReader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


