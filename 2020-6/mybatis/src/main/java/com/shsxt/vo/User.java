package com.shsxt.vo;

import java.util.Date;

public class User {
    private String name;//用户名（英文）

    @Override
    public String toString() {
        return "User{" +
                "id=" + id + '\''
                + ", name='" + name +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", pass='" + pass + '\'' +
                ", tel='" + tel + '\'' +
                ", rname='" + rname + '\'' +
                ", addDate='" + addDate + '\'' +
                '}';
    }

    public User(String name, String sex, String age, String pass, String tel, String rname, String addDate) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.pass = pass;
        this.tel = tel;
        this.rname = rname;
        this.addDate = addDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public User() {
    }


    private Integer id;
    private String sex;//性别
    private String age;//年龄
    private String pass;//密码
    private String tel;//电话
    private String rname;//中文名
    private String addDate;//记录添加时间


}
