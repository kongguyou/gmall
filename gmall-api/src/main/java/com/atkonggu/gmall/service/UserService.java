package com.atkonggu.gmall.service;

import com.atkonggu.gmall.bean.UserAddress;
import com.atkonggu.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {
    List<UserInfo> userList();

    int updateUserByid();
    public void addUser(UserInfo userInfo);

    public void updateUser(String id, UserInfo userInfo);

    public List<UserAddress> getAddressListByUser(String userId);

    UserAddress getUserAddressByAddressId(String deliveryAddress);

}
