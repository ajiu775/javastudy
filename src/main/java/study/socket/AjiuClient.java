package study.socket;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @program: java study
 * @description: client of socket
 * @author: Allen
 * @create: 2020-04-17 20:36
 **/

public class AjiuClient extends JFrame {
    private PrintWriter printWriter;

    private JTextArea jTextArea = new JTextArea();
    private JTextField jTextField = new JTextField();

    private AjiuClient(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        final JScrollPane jScrollPane = new JScrollPane();
        jScrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
        getContentPane().add(jScrollPane, BorderLayout.CENTER);
        jScrollPane.setViewportView(jTextArea);
        container.add(jTextField, "South");
        jTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                printWriter.println(jTextField.getText());
                jTextArea.append(jTextField.getText() + '\n');
                jTextArea.setSelectionEnd(jTextArea.getText().length());
                jTextField.setText("");
            }
        });
    }

    private void connect() {
        jTextArea.append("尝试连接\n");
        try {
            Socket socket = new Socket("127.0.0.1", 1223);
            printWriter = new PrintWriter(socket.getOutputStream(), true);
            jTextArea.append("完成连接\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        AjiuClient ajiuClient = new AjiuClient("向服务器发送数据");
        ajiuClient.setSize(200, 200);
        ajiuClient.setVisible(true);
        ajiuClient.connect();
    }

}