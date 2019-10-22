package com.qxxg.springcloud.cloudmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class VpnOrder implements Serializable {
    private Long id;

    @ApiModelProperty(value = "套餐ID")
    private Long productId;

    @ApiModelProperty(value = "订单支付状态0 支付失败，1 待支付，2支付中，3 支付成功,4 未付款交易超时关闭，或支付完成后全额退款")
    private Integer orderStatus;

    @ApiModelProperty(value = "订单金额（以分为单位）")
    private Double orderAmount;

    @ApiModelProperty(value = "支付类型0 支付宝，1 微信")
    private Integer payType;

    @ApiModelProperty(value = "支付时间")
    private Date payTime;

    @ApiModelProperty(value = "账号ID")
    private Long payUserId;

    @ApiModelProperty(value = "订单状态 0 删除，1 正常")
    private Integer orderDelete;

    @ApiModelProperty(value = "充值人账号（填充loginname）")
    private String payUserName;

    @ApiModelProperty(value = "退款理由")
    private String reason;

    @ApiModelProperty(value = "订单生成时间")
    private Date orderTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", payType=").append(payType);
        sb.append(", payTime=").append(payTime);
        sb.append(", payUserId=").append(payUserId);
        sb.append(", orderDelete=").append(orderDelete);
        sb.append(", payUserName=").append(payUserName);
        sb.append(", reason=").append(reason);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}