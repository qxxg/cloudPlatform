package com.qxxg.springcloud.cloudmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class VipUserPk implements Serializable {
    private Long id;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "套餐ID")
    private Long pkId;

    @ApiModelProperty(value = "充值购买时间")
    private Date rechargeTime;

    @ApiModelProperty(value = "套餐到期时间")
    private Date endTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", pkId=").append(pkId);
        sb.append(", rechargeTime=").append(rechargeTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}