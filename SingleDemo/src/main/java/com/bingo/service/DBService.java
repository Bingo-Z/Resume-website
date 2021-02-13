package com.bingo.service;

import com.bingo.bean.*;
import com.bingo.db.*;

import java.sql.SQLException;

public class DBService {
    private static BaseDao<User> userDao = new UserDaoImp();
    private static BaseDao<Skill> skillDao = new SkillDaoImp();
    private static BaseDao<Specialty> specialtyDao = new SpecialtyDaoImp();
    private static BaseDao<Work> workDao = new WorkDaoImp();
    private static BaseDao<Edu> eduDao = new EduDaoImp();

    public static int insertUser(User user) throws SQLException, ClassNotFoundException {
        return userDao.insert(user);
    }
    public static int insertSkill(Skill skill) throws SQLException, ClassNotFoundException {
        return skillDao.insert(skill);
    }
    public static int insertSpecialty(Specialty specialty) throws SQLException, ClassNotFoundException {
        return specialtyDao.insert(specialty);
    }
    public static int insertWork(Work work) throws SQLException, ClassNotFoundException {
        return workDao.insert(work);
    }
    public static int insertEdu(Edu edu) throws SQLException, ClassNotFoundException {
        return eduDao.insert(edu);
    }

    public static Info find(int userId) throws SQLException, ClassNotFoundException {
        User user = userDao.findByUserId(userId);
        if(user == null){
            return null;
        }
        System.out.println(user);
        Skill skill = skillDao.findByUserId(userId);
        System.out.println(skill);
        Specialty specialty = specialtyDao.findByUserId(userId);
        System.out.println(specialty);
        Work work = workDao.findByUserId(userId);
        System.out.println(work);
        Edu edu = eduDao.findByUserId(userId);
        System.out.println(edu);
        Info info = new Info(user,edu,skill,work,specialty);
        return info;
    }

}
