package com.qxxg.springcloud.cloudmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class VpnPackage implements Serializable {
    private Long id;

    @ApiModelProperty(value = "套餐时长（以月为单位）")
    private Integer pkDuration;

    @ApiModelProperty(value = "套餐类型0 普通套餐，1 高级套餐，")
    private Integer pkType;

    @ApiModelProperty(value = "套餐名称")
    private String pkName;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "套餐说明")
    private String description;

    @ApiModelProperty(value = "套餐包含带宽")
    private Double pkBandwidth;

    @ApiModelProperty(value = "套餐包含流量")
    private Double pkFlow;

    @ApiModelProperty(value = "套餐金额")
    private Long pkAmount;

    @ApiModelProperty(value = "套餐折扣百分比")
    private Integer pkDiscount;

    @ApiModelProperty(value = "套餐状态（0:启用；1:禁用）")
    private Integer isDelete;

    @ApiModelProperty(value = "有效时间")
    private Date validTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pkDuration=").append(pkDuration);
        sb.append(", pkType=").append(pkType);
        sb.append(", pkName=").append(pkName);
        sb.append(", createTime=").append(createTime);
        sb.append(", description=").append(description);
        sb.append(", pkBandwidth=").append(pkBandwidth);
        sb.append(", pkFlow=").append(pkFlow);
        sb.append(", pkAmount=").append(pkAmount);
        sb.append(", pkDiscount=").append(pkDiscount);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", validTime=").append(validTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}