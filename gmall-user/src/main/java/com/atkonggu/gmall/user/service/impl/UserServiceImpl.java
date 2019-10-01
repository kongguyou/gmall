package com.atkonggu.gmall.user.service.impl;

import com.atkonggu.gmall.bean.UserInfo;

import com.atkonggu.gmall.user.mapper.UserInfoMapper;
import com.atkonggu.gmall.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
//    @Autowired
//    UserInfoMapper userInfoMapper;
    @Autowired
    UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> userList() {

        UserInfo userInfo = new UserInfo();
        userInfo.setName("李白");
       List<UserInfo> userInfos = userInfoMapper.selectAll();
        return userInfos;
    }

    @Override
    public int updateUserByid() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("酒仙");
        int result=userInfoMapper.updateByPrimaryKey(userInfo);
        return result;
    }

}
