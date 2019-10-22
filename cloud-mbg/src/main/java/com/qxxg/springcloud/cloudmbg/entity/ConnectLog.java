package com.qxxg.springcloud.cloudmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class ConnectLog implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "用户名称(loginname)")
    private String userName;

    @ApiModelProperty(value = "连接时间")
    private Date connectTime;

    @ApiModelProperty(value = "ip地址")
    private String ip;

    @ApiModelProperty(value = "终端类型（0：手机端；1：PC端）")
    private Integer terminalType;

    @ApiModelProperty(value = "流量服务器IP")
    private String serverIp;

    @ApiModelProperty(value = "流量服务器端口")
    private String serverPort;

    @ApiModelProperty(value = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", connectTime=").append(connectTime);
        sb.append(", ip=").append(ip);
        sb.append(", terminalType=").append(terminalType);
        sb.append(", serverIp=").append(serverIp);
        sb.append(", serverPort=").append(serverPort);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}