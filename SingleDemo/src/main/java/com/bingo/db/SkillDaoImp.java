package com.bingo.db;

import com.bingo.bean.Skill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SkillDaoImp implements BaseDao<Skill> {

    private static final String SQL_INSERT = "insert into bingo_skill(userid,keywords) values(?,?)";
    private static final String SQL_FIND_BY_USERID = "select * from bingo_skill where userid=?";

    @Override
    public int insert(Skill skill) throws SQLException, ClassNotFoundException {
        Connection conn = DButil.getConn();
        PreparedStatement state = null;
        ResultSet resultSte = null;
        try {
            state = conn.prepareStatement(SQL_INSERT);
            state.setInt(1,skill.getUserId());
            state.setString(2,skill.getKeyWords());
            int row = state.executeUpdate();
            return row>0?row:-1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DButil.close(conn,state,resultSte);
        }
        return -1;
    }

    @Override
    public Skill findByUserId(int userId) throws SQLException, ClassNotFoundException {
        Connection conn = DButil.getConn();
        PreparedStatement state = null;
        ResultSet resultSte = null;
        Skill skill = null;
        try {
            state = conn.prepareStatement(SQL_FIND_BY_USERID);
            state.setInt(1,userId);
            resultSte = state.executeQuery();
            if(resultSte.next()){
                int id = resultSte.getInt("id");
                String keywords = resultSte.getString("keywords");
                skill = new Skill(id,userId,keywords);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DButil.close(conn,state,resultSte);
        }
        return skill;
    }
}
