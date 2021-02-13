package com.bingo.db;

import com.bingo.bean.Specialty;
import com.bingo.bean.Work;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SpecialtyDaoImp implements BaseDao<Specialty> {

    private static final String SQL_INSERT = "insert into bingo_specialty(userid,name,description) values(?,?,?)";
    private static final String SQL_FIND_BY_USERID = "select * from bingo_specialty where userid=?";

    @Override
    public int insert(Specialty specialty) throws SQLException, ClassNotFoundException {
        Connection conn = DButil.getConn();
        PreparedStatement state = null;
        ResultSet resultSte = null;
        try {
            state = conn.prepareStatement(SQL_INSERT);
            state.setInt(1,specialty.getUserId());
            state.setString(2,specialty.getName());
            state.setString(3,specialty.getDescription());
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
    public Specialty findByUserId(int userId) throws SQLException, ClassNotFoundException {
        Connection conn = DButil.getConn();
        PreparedStatement state = null;
        ResultSet resultSte = null;
        Specialty specialty = null;
        try {
            state = conn.prepareStatement(SQL_FIND_BY_USERID);
            state.setInt(1,userId);
            resultSte = state.executeQuery();
            while(resultSte.next()){
                if(specialty != null){
                    Specialty temp = new Specialty();
                    temp.setNext(specialty);
                    specialty = temp;
                }else{
                    specialty = new Specialty();
                }
                int id = resultSte.getInt("id");
                String name = resultSte.getString("name");
                String description = resultSte.getString("description");
                specialty.setId(id);
                specialty.setName(name);
                specialty.setDescription(description);
                specialty.setUserId(userId);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DButil.close(conn,state,resultSte);
        }
        return specialty;
    }
}
