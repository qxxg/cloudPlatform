package com.qxxg.springcloud.clouduser.service;


import com.qxxg.springcloud.cloudmbg.entity.LogEntity;
import com.qxxg.springcloud.clouduser.service.impl.FeignClienServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "cloud-logs",fallback = FeignClienServiceImpl.class)
public interface FeignClienService   {

    @RequestMapping(value = "/logs/insertlogs",method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public String insertLogs(LogEntity entity);
}
