package com.qxxg.springcloud.cloudmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class VpnEdition implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Long id;

    @ApiModelProperty(value = "发布时间")
    private Date publishTime;

    @ApiModelProperty(value = "版本号")
    private String editionNo;

    @ApiModelProperty(value = "文件名")
    private String docName;

    @ApiModelProperty(value = "文件大小(存储字节数)")
    private String docSize;

    @ApiModelProperty(value = "校验值")
    private String verifyValue;

    @ApiModelProperty(value = "类型（0:新建；1:更新；2:强制更新）")
    private Short editionType;

    @ApiModelProperty(value = "终端类型(0:手机端；1:PC端)")
    private Short terminalType;

    @ApiModelProperty(value = "版本状态(0:待发布；1:已发布)")
    private Short editionState;

    @ApiModelProperty(value = "版本code")
    private String editionCode;

    @ApiModelProperty(value = "版本说明")
    private String description;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", editionNo=").append(editionNo);
        sb.append(", docName=").append(docName);
        sb.append(", docSize=").append(docSize);
        sb.append(", verifyValue=").append(verifyValue);
        sb.append(", editionType=").append(editionType);
        sb.append(", terminalType=").append(terminalType);
        sb.append(", editionState=").append(editionState);
        sb.append(", editionCode=").append(editionCode);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}