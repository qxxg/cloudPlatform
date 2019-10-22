package com.qxxg.springcloud.clouduser.service;


import com.qxxg.springcloud.cloudmbg.entity.TyUser;

/**
 * @Author SmallSand
 * @Date 2019/10/18  10:45
 */
public interface UserService {

    int insertSelective(TyUser record);
}
