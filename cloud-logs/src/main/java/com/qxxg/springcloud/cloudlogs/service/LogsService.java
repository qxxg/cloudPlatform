package com.qxxg.springcloud.cloudlogs.service;

import com.qxxg.springcloud.cloudlogs.entity.LogEntity;

public interface LogsService {

    boolean insertLogs(LogEntity entity);
}
