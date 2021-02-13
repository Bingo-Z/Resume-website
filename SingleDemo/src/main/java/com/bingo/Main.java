package com.bingo;

import com.bingo.bean.User;
import com.bingo.service.DBServiceDemo;

import java.sql.SQLException;

public class Main {
    public static void main(String []args) throws SQLException, ClassNotFoundException {
        User user = new User("1",1,"1","1","1","1","1","1","1","1","1");
        DBServiceDemo.insertUser(user);
    }
}
