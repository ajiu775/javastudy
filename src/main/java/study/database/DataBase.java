package study.database;

import java.sql.*;

/**
 * @program: java study
 * @description:
 * @author: Allen
 * @create: 2020-08-26 15:27
 **/

public class DataBase {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        long startTime = System.currentTimeMillis();
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://106.52.235.72:3306/brave?";
            String userName = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, userName, password);
            connection.setAutoCommit(false);
            String sql1 = "update user set username = '张三' where userName = '??' ";
            String sql2 = "update user set username = '李四季' where userName = '李四' ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql1);
            preparedStatement.addBatch();
            preparedStatement.executeBatch();
            int count = preparedStatement.executeUpdate();
            PreparedStatement preparedStatement1 =connection.prepareStatement(sql2);
            preparedStatement1.executeUpdate();
            if(count!=1){
                connection.rollback();
            }else {
                connection.commit();
            }
        }finally {
            connection.close();
        }
        System.out.println(connection.getAutoCommit());
        System.out.println(connection.isClosed());
        

    }
}
