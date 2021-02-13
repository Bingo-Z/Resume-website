package com.bingo.db;

import java.sql.SQLException;

public interface BaseDao <T>{
    /**
     * 用于规范操作数据库五个表格的新增数据规则
     * @param  t 新增数据t
     * @return  返回新增结果， 是一个数字，大于0表示新增成功
     */
    int insert(T t) throws SQLException, ClassNotFoundException;

    /**
     * 用于规范操作数据库5个表的获取数据规则
     * @return 返回获取的数据
     */
    T findByUserId(int userId) throws SQLException, ClassNotFoundException;


}
