package com.qxxg.springcloud.clouduser.service.impl;

import com.qxxg.springcloud.cloudmbg.entity.LogEntity;
import com.qxxg.springcloud.clouduser.service.FeignClienService;
import org.springframework.stereotype.Component;

/**
 * @Author SmallSand
 * @Date 2019/10/23  10:18
 */
@Component
public class FeignClienServiceImpl implements FeignClienService {
    @Override
    public String insertLogs(LogEntity entity) {
        return "网络中断";
    }
}
