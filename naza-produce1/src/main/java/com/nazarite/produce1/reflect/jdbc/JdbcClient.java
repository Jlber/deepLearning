package com.nazarite.produce1.reflect.jdbc;

import java.sql.*;

/**
 * @Author:elbert
 * @Date:2019-08-30
 */

public class JdbcClient {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/400DB?useUnicode=true&characterEncoding=UTF-8&useSSL=false";
        Connection connection =  DriverManager.getConnection(url,"root","Yanlei2018");
        Statement statement=connection.createStatement();
        ResultSet resultSet= statement.executeQuery("SELECT * from business where number400='4008800248' ");
        while (resultSet.next()){
            System.out.println(resultSet.getString("number400")+":"+resultSet.getString("companyName"));
        }
    }
}
