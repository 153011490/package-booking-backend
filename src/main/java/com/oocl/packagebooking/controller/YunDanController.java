package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.entity.YunDan;
import com.oocl.packagebooking.service.YunDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/yundanhao")
public class YunDanController {

    @Autowired
    private YunDanService yunDanService;

    @PostMapping
    public String addYunDan(@RequestBody YunDan yunDan){
        try{
            yunDanService.addYunDan(yunDan);
            return "添加成功";
        }catch (Exception e){
            return "添加失败";
        }
    }

    @GetMapping
    public List<YunDan> findAll(){
        return yunDanService.findAll();
    }

    @PutMapping
    public String updateStatus(@RequestBody YunDan yunDan){
        try{
            yunDanService.updateYunDan(yunDan);
            return "更新成功";
        }catch (Exception e){
            return "更新失败";
        }
    }



}
