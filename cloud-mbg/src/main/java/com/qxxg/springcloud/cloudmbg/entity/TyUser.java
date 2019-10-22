package com.qxxg.springcloud.cloudmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class TyUser implements Serializable {
    private Long id;

    @ApiModelProperty(value = "登录名，存储手机号")
    private String loginname;

    @ApiModelProperty(value = "用户邮箱")
    private String email;

    @ApiModelProperty(value = "登录密码")
    private String password;

    @ApiModelProperty(value = "当前账号是否被禁用0 正常，1 禁用")
    private Integer userDelete;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "最后登录时间")
    private Date lastTime;

    @ApiModelProperty(value = "最后登录ip")
    private String loginIp;

    @ApiModelProperty(value = "账号类型0 普通用户，1 vip用户,2 后台管理员")
    private Integer userType;

    @ApiModelProperty(value = "用户昵称")
    private String nickname;

    @ApiModelProperty(value = "加密秘钥")
    private String secretKey;

    @ApiModelProperty(value = "在线状态0 下线，1 在线")
    private Integer onlineStatus;

    @ApiModelProperty(value = "套餐终结时间")
    private Date endTime;

    @ApiModelProperty(value = "短信验证码")
    private String verificationCode;

    @ApiModelProperty(value = "当前使用的VPN线路")
    private Integer vpnLine;

    @ApiModelProperty(value = "当前账号推广码")
    private String promotionCode;

    @ApiModelProperty(value = "当前账号推荐人推广码")
    private String referrer;

    @ApiModelProperty(value = "用户头像地址")
    private String photoUrl;

    @ApiModelProperty(value = "0 结束时间无效，1 结束时间有效")
    private Integer endStatus;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginname=").append(loginname);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", userDelete=").append(userDelete);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", userType=").append(userType);
        sb.append(", nickname=").append(nickname);
        sb.append(", secretKey=").append(secretKey);
        sb.append(", onlineStatus=").append(onlineStatus);
        sb.append(", endTime=").append(endTime);
        sb.append(", verificationCode=").append(verificationCode);
        sb.append(", vpnLine=").append(vpnLine);
        sb.append(", promotionCode=").append(promotionCode);
        sb.append(", referrer=").append(referrer);
        sb.append(", photoUrl=").append(photoUrl);
        sb.append(", endStatus=").append(endStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}