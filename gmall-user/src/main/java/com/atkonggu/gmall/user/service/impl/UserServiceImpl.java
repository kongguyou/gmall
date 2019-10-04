package com.atkonggu.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atkonggu.gmall.bean.UserAddress;
import com.atkonggu.gmall.bean.UserInfo;

import com.atkonggu.gmall.user.mapper.UserAddressMapper;
import com.atkonggu.gmall.user.mapper.UserInfoMapper;
import com.atkonggu.gmall.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    UserAddressMapper userAddressMapper;
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
        userInfo.setId("1");
        int result=userInfoMapper.updateByPrimaryKey(userInfo);
        return result;
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insert(userInfo);
    }

    @Override
    public void updateUser(String id, UserInfo userInfo) {

    }

    @Override
    public List<UserAddress> getAddressListByUser(String userId) {
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        List<UserAddress> userAddresseList = userAddressMapper.select(userAddress);
        return userAddresseList;
    }

    @Override
    public UserAddress getUserAddressByAddressId(String deliveryAddress) {
        UserAddress userAddress = new UserAddress();
        userAddress.setId(deliveryAddress);
        UserAddress userAddress1 = userAddressMapper.selectByPrimaryKey(userAddress);
        return userAddress1;
    }

}
