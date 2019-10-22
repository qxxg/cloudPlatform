package com.qxxg.springcloud.cloudmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UserOperateLog implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "业务id（用户相关填充用户id，订单相关填充订单id...）")
    private String objectId;

    @ApiModelProperty(value = "业务名称（用户相关填充loginname，订单相关填充充值人账号...）")
    private String objectName;

    @ApiModelProperty(value = "操作人id")
    private String operator;

    @ApiModelProperty(value = "操作人姓名")
    private String operateName;

    @ApiModelProperty(value = "操作时间")
    private Date operateTime;

    @ApiModelProperty(value = "ip地址")
    private String ip;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "日志类型（0:用户登录；1：变更平台用户状态；2：变更APP用户状态；3：变更平台用户权限；4：变更平台用户角色；5：退款；6：发布版本；7：发布通知）")
    private Integer logType;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", objectId=").append(objectId);
        sb.append(", objectName=").append(objectName);
        sb.append(", operator=").append(operator);
        sb.append(", operateName=").append(operateName);
        sb.append(", operateTime=").append(operateTime);
        sb.append(", ip=").append(ip);
        sb.append(", remark=").append(remark);
        sb.append(", logType=").append(logType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}