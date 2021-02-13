package com.bingo.service;

import com.bingo.bean.User;
import com.bingo.db.BaseDao;
import com.bingo.db.UserDaoImp;

import java.sql.SQLException;

public class DBServiceDemo {
    private static BaseDao<User> userDao = new UserDaoImp();
    public static int insertUser(User user) throws SQLException, ClassNotFoundException {
            return userDao.insert(user);
    }


}
