package com.oocl.packagebooking.service;

import com.oocl.packagebooking.entity.YunDan;
import com.oocl.packagebooking.respository.YunDanReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YunDanService {

    @Autowired
    private YunDanReposity yunDanReposity;

    public void addYunDan(YunDan yunDan){
        yunDanReposity.save(yunDan);
    }

    public List<YunDan> findAll() {
        return  yunDanReposity.findAll();
    }
}
