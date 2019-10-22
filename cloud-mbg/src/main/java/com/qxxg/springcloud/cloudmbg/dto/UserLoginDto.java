package com.qxxg.springcloud.cloudmbg.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginDto {
    @ApiModelProperty(value = "用户名", required = true)
    private String loginname;
    @ApiModelProperty(value = "密码", required = true)
    private String password;
    @ApiModelProperty(value = "验证码")
    private String authCode;
    @ApiModelProperty(value = "终端类型,0:APP手机端;1:PC端", required = true)
    private Integer terminalType;
    @ApiModelProperty(value = "ip地址")
    private String ip;
}
