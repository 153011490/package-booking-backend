package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.entity.Package;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

class RookieStationControllerTest {
    @Autowired
    private RookieStationController rookieStationController;

    @Test
    public void should_return_success_message_when_call_addyundan_given_yundan(){
        //given
        Package aPackage =new Package("123456","Amy",13800138000L,"1",new Date().toString());

        //when
        String actual= rookieStationController.addYunDan(aPackage);




    }

}