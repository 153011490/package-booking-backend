package com.oocl.packagebooking.controller;

import com.oocl.packagebooking.entity.YunDan;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class YunDanControllerTest {
    @Autowired
    private YunDanController yunDanController;

    @Test
    public void should_return_success_message_when_call_addyundan_given_yundan(){
        //given
        YunDan yunDan=new YunDan("123456","Amy",13800138000L,"1",new Date().toString());

        //when
        String actual=yunDanController.addYunDan(yunDan);




    }

}