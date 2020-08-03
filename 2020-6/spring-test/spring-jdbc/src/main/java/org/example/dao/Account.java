package org.example.dao;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private Integer id;
    private String aname;
    private String type;
    private String remark;
    private Date createTime;
    private Date updateTime;
    private double money;
    private Integer userId;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", aname='" + aname + '\'' +
                ", type='" + type + '\'' +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", money=" + money +
                ", userId=" + userId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Account() {
    }

    public Account(String aname, String type, String remark, Date createTime, Date updateTime, double money, Integer userId) {
        this.aname = aname;
        this.type = type;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.money = money;
        this.userId = userId;
    }
}