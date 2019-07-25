package com.oocl.packagebooking.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class YunDan {

    @Id
    private String yundanhao;

    private String reciver;

    private Long phone;

    private String status;

    private String time;

    public String getYundanhao() {
        return yundanhao;
    }

    public void setYundanhao(String yundanhao) {
        this.yundanhao = yundanhao;
    }

    public String getReciver() {
        return reciver;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public YunDan() {
    }

    public YunDan(String yundanhao, String reciver, Long phone, String status, String time) {
        this.yundanhao = yundanhao;
        this.reciver = reciver;
        this.phone = phone;
        this.status = status;
        this.time = time;
    }
}
