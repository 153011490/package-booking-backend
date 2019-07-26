package com.oocl.packagebooking.service;

import com.oocl.packagebooking.entity.Package;
import com.oocl.packagebooking.respository.RookieStationReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class RookieStationService {

    @Autowired
    private RookieStationReposity rookieStationReposity;

    public void addPackage(Package aPackage){
        rookieStationReposity.save(aPackage);
    }

    public List<Package> findAll() {
        return  rookieStationReposity.findAll();
    }

    public void updateYunDan(Package aPackage) {
        rookieStationReposity.save(aPackage);
    }

    public List<Package> findByStatus(String state) {
        return rookieStationReposity.findByStatus(state);
    }

    public String preed(String id, String time) {
        Package aPackage = rookieStationReposity.findByPackageId(id);
        if(aPackage ==null||Integer.valueOf(time.substring(11).replace(":",""))>200000||Integer.valueOf(time.substring(11).replace(":",""))<90000)return "fail";
        aPackage.setTime(time);
        aPackage.setStatus("1");
        rookieStationReposity.save(aPackage);
        return "success";
    }
}
