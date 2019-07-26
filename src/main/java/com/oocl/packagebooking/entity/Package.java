package com.oocl.packagebooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Package {

    @Id
    private String packageId;

    private String name;

    private Long phone;

    @Column(name="status")
    private String status;

    private String time;

    public Package() {
    }

    public Package(String packageId, String name, Long phone, String status, String time) {
        this.packageId = packageId;
        this.name = name;
        this.phone = phone;
        this.status = status;
        this.time = time;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
