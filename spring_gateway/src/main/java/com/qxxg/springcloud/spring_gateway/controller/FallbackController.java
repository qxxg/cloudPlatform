package com.qxxg.springcloud.spring_gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author SmallSand
 * @Date 2019/10/25  11:51
 */

@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public Map<String,Object> fallback() {
        Map<String,Object> response = new HashMap<>();
        response.put("code","100");
        response.put("msg","网络堵塞,稍后再试！");
        return response;
    }

}
