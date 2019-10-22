package com.qxxg.springcloud.clouduser.controller;

import com.qxxg.springcloud.cloudcommon.util.result.CommonResult;
import com.qxxg.springcloud.clouduser.service.UserService;
import com.qxxg.springcloud.cloudmbg.entity.TyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author SmallSand
 * @Date 2019/10/18  11:10
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @GetMapping("sayhello")
    public CommonResult sayHello(){
        return CommonResult.success("Hello Word");
    }

    @PostMapping(value = "registereduser")
    public CommonResult registeredUser(TyUser user){
        int i = userServiceImpl.insertSelective(user);
        if(i > 0)
            return CommonResult.success("用户保存成功");
        else
            return CommonResult.failed("用户保存失败");

    }

}
