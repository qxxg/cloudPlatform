package com.qxxg.springcloud.cloudmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@Data
public class ServiceOnlineUsers implements Serializable {
    @ApiModelProperty(value = "服务器IP")
    private String ipPort;

    private Long id;

    @ApiModelProperty(value = "服务器id")
    private Long serviceId;

    @ApiModelProperty(value = "端口")
    private String port;

    @ApiModelProperty(value = "密码")
    private String passwd;

    @ApiModelProperty(value = "客户端加密方式")
    private String method;

    @ApiModelProperty(value = "在线人数")
    private Integer onlineUsers;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ipPort=").append(ipPort);
        sb.append(", id=").append(id);
        sb.append(", serviceId=").append(serviceId);
        sb.append(", port=").append(port);
        sb.append(", passwd=").append(passwd);
        sb.append(", method=").append(method);
        sb.append(", onlineUsers=").append(onlineUsers);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}