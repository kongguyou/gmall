package com.atkonggu.gmall.user.controller;


import com.atkonggu.gmall.bean.UserInfo;
import com.atkonggu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("userList")
    public ResponseEntity<List<UserInfo>> userList(){
        List<UserInfo> userInfoList =  userService.userList();

        return ResponseEntity.ok(userInfoList);
    }
    @RequestMapping("updateUser")
    public int updateUser(){
       return userService.updateUserByid();
    }
}
