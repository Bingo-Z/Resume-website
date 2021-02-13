package com.bingo.servlet;

import com.bingo.bean.Result;
import com.bingo.bean.User;
import com.bingo.service.DBServiceDemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/v1/user/insert")
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.    避免乱码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/json;charset=utf-8");
        //2.    接受浏览器传送的数据
        String name = request.getParameter("name");
        String city = request.getParameter("city");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String weixin = request.getParameter("weixin");
        String qq = request.getParameter("qq");
        String weibo = request.getParameter("weibo");
        String sex = request.getParameter("sex");
        String description = request.getParameter("description");
        String ageText = request.getParameter("age");

        int age=-1;
        try {
            age= Integer.parseInt(ageText);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        //3.    调用service
        User user=new User(name,age,city,address,email,phone,weixin,qq,weibo,sex,description);


        try {
            int userID = DBServiceDemo.insertUser(user);
            //4.    将存储的结果封装为json格式，发送给浏览器

            Result r=null;
            if(userID>0){
                r = new Result(0,"用户新增成功",userID);
            } else{
                r = new Result(-1,"用户新增失败",null);
            }
            String json=r.toJSON();
            response.getWriter().append(json);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
