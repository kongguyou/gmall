package com.atkonggu.gmall.service;

import com.atkonggu.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> userList();

    int updateUserByid();

}
