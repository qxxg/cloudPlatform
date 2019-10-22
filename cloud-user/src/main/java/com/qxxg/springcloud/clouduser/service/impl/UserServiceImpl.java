package com.qxxg.springcloud.clouduser.service.impl;

import com.qxxg.springcloud.cloudcommon.util.SystemUtil;
import com.qxxg.springcloud.clouduser.service.UserService;
import com.qxxg.springcloud.cloudmbg.entity.TyUser;
import com.qxxg.springcloud.cloudmbg.mapper.TyUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author SmallSand
 * @Date 2019/10/18  10:46
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TyUserMapper tyUserMapper;

    @Override
    public int insertSelective(TyUser record) {
        int i = 0;
        try {
            record.setId(SystemUtil.getId());
            record.setCreateTime(new Date());
            i = tyUserMapper.insertSelective(record);
        } catch (Exception e) {
            log.debug("======>用户数据保存报错:\n",e);
        }
        return i;
    }
}
