package com.bingo.util;

import java.sql.*;

/**
 * 这部分的作用是连接数据库
 * 1.**掌握连接数据库的方法**
 */
public class DButil {
    //1.连接数据库
    public static Connection getConn() throws ClassNotFoundException, SQLException {
        //1.加载数据驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.获取数据库连接
//        Connection conn=DriverManager.getConnection("jdbc:mysql://bingo-z.rwlb.rds.aliyuncs.com/curriculum-vitae", "bingo", "Zb1998824");
        Connection conn=DriverManager. getConnection("jdbc:mysql://localhost:3306/curriculum-vitae?serverTimezone=GMT%2B8","root","zb1998824");
        //3.将连接返回数据可使用者
        return conn;
    }

    //2.断开连接
    public static void close(Connection conn, Statement statement, ResultSet resultSet){
        try {
            if(conn!=null){
                conn.close();
            }
            if(statement!=null){
                conn.close();
            }
            if(resultSet!=null){
                conn.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
