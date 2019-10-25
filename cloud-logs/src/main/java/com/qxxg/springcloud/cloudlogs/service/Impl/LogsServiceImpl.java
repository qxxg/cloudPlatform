package com.qxxg.springcloud.cloudlogs.service.Impl;

import com.qxxg.springcloud.cloudlogs.entity.LogEntity;
import com.qxxg.springcloud.cloudlogs.service.LogsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author SmallSand
 * @Date 2019/10/23  9:53
 */
@Slf4j
@Service
public class LogsServiceImpl implements LogsService {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public boolean insertLogs(LogEntity entity) {
        LogEntity insert = mongoTemplate.insert(entity);
        log.info("==========》保存用户日志");
        return insert != null;
    }
}
