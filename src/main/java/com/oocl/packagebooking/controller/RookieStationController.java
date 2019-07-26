package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.entity.Package;
import com.oocl.packagebooking.service.RookieStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/packages")
public class RookieStationController {

    @Autowired
    private RookieStationService rookieStationService;

    @PostMapping
    public String addYunDan(@RequestBody Package aPackage){
        try{
            rookieStationService.addPackage(aPackage);
            return "添加成功";
        }catch (Exception e){
            return "添加失败";
        }
    }

    @GetMapping
    public List<Package> findAll(){
        return rookieStationService.findAll();
    }

    @PutMapping
    public String updateStatus(@RequestBody Package aPackage){
        try{
            rookieStationService.updateYunDan(aPackage);
            return "更新成功";
        }catch (Exception e){
            return "更新失败";
        }
    }

    @GetMapping("/status/{state}")
    public List<Package> findByStatus(@PathVariable("state") String state){
        return rookieStationService.findByStatus(state);
    }

    @PutMapping("/ids/{id}")
    public String preed(@PathVariable("id")String id,@RequestParam("time") String time){
        return rookieStationService.preed(id,time);
    }



}
