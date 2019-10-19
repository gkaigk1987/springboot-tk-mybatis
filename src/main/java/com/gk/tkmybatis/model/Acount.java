package com.gk.tkmybatis.model;

import java.util.Date;
import javax.persistence.*;

public class Acount {
    /**
     * 主键
     */
    @Id
    private String id;

    private String name;

    /**
     * 收支方向（1：收入，2：支出）
     */
    private String balance;

    /**
     * 账单类型
     */
    private String type;

    /**
     * 为谁花的钱
     */
    private String forwho;

    /**
     * 花的钱数
     */
    private Double money;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建者
     */
    private String creator;

    private Date createtime;

    private String modifier;

    private Date modifytime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取收支方向（1：收入，2：支出）
     *
     * @return balance - 收支方向（1：收入，2：支出）
     */
    public String getBalance() {
        return balance;
    }

    /**
     * 设置收支方向（1：收入，2：支出）
     *
     * @param balance 收支方向（1：收入，2：支出）
     */
    public void setBalance(String balance) {
        this.balance = balance == null ? null : balance.trim();
    }

    /**
     * 获取账单类型
     *
     * @return type - 账单类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置账单类型
     *
     * @param type 账单类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取为谁花的钱
     *
     * @return forwho - 为谁花的钱
     */
    public String getForwho() {
        return forwho;
    }

    /**
     * 设置为谁花的钱
     *
     * @param forwho 为谁花的钱
     */
    public void setForwho(String forwho) {
        this.forwho = forwho == null ? null : forwho.trim();
    }

    /**
     * 获取花的钱数
     *
     * @return money - 花的钱数
     */
    public Double getMoney() {
        return money;
    }

    /**
     * 设置花的钱数
     *
     * @param money 花的钱数
     */
    public void setMoney(Double money) {
        this.money = money;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取创建者
     *
     * @return creator - 创建者
     */
    public String getCreator() {
        return creator;
    }

    /**
     * 设置创建者
     *
     * @param creator 创建者
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return modifier
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param modifier
     */
    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    /**
     * @return modifytime
     */
    public Date getModifytime() {
        return modifytime;
    }

    /**
     * @param modifytime
     */
    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}