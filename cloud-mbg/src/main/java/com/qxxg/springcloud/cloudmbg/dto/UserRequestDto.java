package com.qxxg.springcloud.cloudmbg.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto extends UserLoginDto {
    @ApiModelProperty(value = "旧密码")
    private String oldpassword;
    @ApiModelProperty(value = "账号类型0 普通用户，1 vip用户")
    private Integer userType;
    @ApiModelProperty(value = "当前账号是否被禁用0 正常，1 禁用")
    private Integer status;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "用户昵称")
    private String nickName;
    @ApiModelProperty(value = "备注")
    private String note;
}
