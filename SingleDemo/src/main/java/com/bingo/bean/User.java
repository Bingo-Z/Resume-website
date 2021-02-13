package com.bingo.bean;

import java.util.Objects;

/**
 *
 */
public class User {
    //用户编号
    private  int id;
    //用户姓名
    private  String name;
    //年龄
    private  int age;
    //城市
    private String city;
    //详细住址
    private  String address;
    //邮箱
    private  String email;
    //电话
    private String phone;
    //微信
    private String weixin;
    //qq
    private String  qq;
    //微博
    private String weibo;
    //性别
    private String sex;
    //简介
    private String description;

    public User() {
    }

    public User(String name, int age, String city, String address, String email, String phone, String weixin, String qq, String weibo, String sex, String description) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.weixin = weixin;
        this.qq = qq;
        this.weibo = weibo;
        this.sex = sex;
        this.description = description;
    }

    public User(int id, String name, int age, String city, String address, String email, String phone, String weixin, String qq, String weibo, String sex, String description) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.weixin = weixin;
        this.qq = qq;
        this.weibo = weibo;
        this.sex = sex;
        this.description = description;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", weixin='" + weixin + '\'' +
                ", qq='" + qq + '\'' +
                ", weibo='" + weibo + '\'' +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                getAge() == user.getAge() &&
                getName().equals(user.getName()) &&
                getCity().equals(user.getCity()) &&
                getAddress().equals(user.getAddress()) &&
                getEmail().equals(user.getEmail()) &&
                getPhone().equals(user.getPhone()) &&
                getWeixin().equals(user.getWeixin()) &&
                getQq().equals(user.getQq()) &&
                getWeibo().equals(user.getWeibo()) &&
                getSex().equals(user.getSex()) &&
                getDescription().equals(user.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getCity(), getAddress(), getEmail(), getPhone(), getWeixin(), getQq(), getWeibo(), getSex(), getDescription());
    }
}
