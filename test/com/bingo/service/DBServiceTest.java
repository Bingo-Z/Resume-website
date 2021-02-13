package com.bingo.service;

import com.bingo.bean.User;
import org.junit.Test;

import java.sql.SQLException;

public class DBServiceTest {

    @Test
    public void userInsert() throws SQLException, ClassNotFoundException {
        User user = new User("1",1,"1","1","1","1","1","1","1","1","1");
        DBServiceDemo.insertUser(user);
    }
}