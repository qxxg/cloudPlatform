package com.qxxg.springcloud.cloudmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@Data
public class VpnServer implements Serializable {
    private Long id;

    @ApiModelProperty(value = "VPN服务器ip")
    private String serverIp;

    @ApiModelProperty(value = "VPN服务器端口")
    private String serverPort;

    @ApiModelProperty(value = "VPN服务器加密类型")
    private String encryptionType;

    @ApiModelProperty(value = "VPN服务器所属区域")
    private String serverRegion;

    @ApiModelProperty(value = "VPN服务器使用状态0 正常，1 停止")
    private Integer serverStatus;

    @ApiModelProperty(value = "服务器描述")
    private String description;

    @ApiModelProperty(value = "服务器线路")
    private String serverLine;

    @ApiModelProperty(value = "服务器类型0 普通服务器，1 浏览服务器")
    private Integer serverType;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serverIp=").append(serverIp);
        sb.append(", serverPort=").append(serverPort);
        sb.append(", encryptionType=").append(encryptionType);
        sb.append(", serverRegion=").append(serverRegion);
        sb.append(", serverStatus=").append(serverStatus);
        sb.append(", description=").append(description);
        sb.append(", serverLine=").append(serverLine);
        sb.append(", serverType=").append(serverType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}