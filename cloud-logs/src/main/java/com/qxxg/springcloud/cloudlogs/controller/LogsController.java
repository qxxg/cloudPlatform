package com.qxxg.springcloud.cloudlogs.controller;

import com.qxxg.springcloud.cloudlogs.entity.LogEntity;
import com.qxxg.springcloud.cloudlogs.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author SmallSand
 * @Date 2019/10/23  9:13
 */
@RequestMapping("/logs")
@RestController
public class LogsController {
    @Autowired
    private LogsService logsServiceImpl;

    @RequestMapping(value = "/insertlogs",method = RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public boolean insertLogs(LogEntity entity){
        return logsServiceImpl.insertLogs(entity);
    }
}
