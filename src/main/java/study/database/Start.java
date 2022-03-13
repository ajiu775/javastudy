package study.database;

import java.sql.*;

/**
 * @Description:
 * @Author: Mr.Allen
 * @Date: 2021/2/25/21:13
 */
public class Start {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/example", "root", "123456");
        connection.setAutoCommit(false);
        String sql = "select * from user";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        String sql1 = "update  user set age = ? where age > ?";
        preparedStatement = connection.prepareStatement(sql1);
        preparedStatement.setInt(1,20);
        preparedStatement.setInt(2,19);
        preparedStatement.executeUpdate();
        String sql2 = "select * from user where age > ?";
        preparedStatement = connection.prepareStatement(sql2);
        preparedStatement.setInt(1,19);
        resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
            System.out.println(resultSet.getString("username"));
        }
        connection.commit();
    }

}