package com.shsxt.vo;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private Integer id;
    private String aname;
    private String type;
    private BigDecimal money;
    private String remark;
    private Date createTime;
    private Date updateTime;
    private Integer userId;

    public Account() {
    }

    public Account(String aname, String type, BigDecimal money, String remark, Date createTime, Date updateTime, Integer userId) {
        this.aname = aname;
        this.type = type;
        this.money = money;
        this.remark = remark;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", aname='" + aname + '\'' +
                ", type='" + type + '\'' +
                ", money=" + money +
                ", remark='" + remark + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", userId=" + userId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
