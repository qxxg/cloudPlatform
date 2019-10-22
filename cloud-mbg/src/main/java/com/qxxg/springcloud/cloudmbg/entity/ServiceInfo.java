package com.qxxg.springcloud.cloudmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class ServiceInfo implements Serializable {
    @ApiModelProperty(value = "公网IP")
    private String ipAddr;

    private Long id;

    @ApiModelProperty(value = "最大支持总在线人数")
    private Integer maxSupport;

    @ApiModelProperty(value = "当前上网延迟，单位ms")
    private Integer netDelay;

    @ApiModelProperty(value = "翻墙外网区域:  US/ENG/HK")
    private String targetArea;

    @ApiModelProperty(value = "当前服务器状态：normal(正常使用)/upgrading(维护升级中)/unknown(未知状态)等")
    private String serverStatus;

    @ApiModelProperty(value = "当前CPU使用率")
    private String cpuUtility;

    @ApiModelProperty(value = "当前剩余内存")
    private String memFree;

    @ApiModelProperty(value = "服务器用途：internet/game/video/composite等")
    private String serverType;

    @ApiModelProperty(value = "服务器级别：svip/vip/general等")
    private String serverLevel;

    @ApiModelProperty(value = "软件版本")
    private String softwareVer;

    @ApiModelProperty(value = "系统版本")
    private String systemVer;

    @ApiModelProperty(value = "CPU信息")
    private String cpu;

    @ApiModelProperty(value = "内存大小")
    private String memory;

    @ApiModelProperty(value = "硬盘大小")
    private String hdisk;

    @ApiModelProperty(value = "网卡支持带宽")
    private String netCard;

    @ApiModelProperty(value = "服务器创建时间")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ipAddr=").append(ipAddr);
        sb.append(", id=").append(id);
        sb.append(", maxSupport=").append(maxSupport);
        sb.append(", netDelay=").append(netDelay);
        sb.append(", targetArea=").append(targetArea);
        sb.append(", serverStatus=").append(serverStatus);
        sb.append(", cpuUtility=").append(cpuUtility);
        sb.append(", memFree=").append(memFree);
        sb.append(", serverType=").append(serverType);
        sb.append(", serverLevel=").append(serverLevel);
        sb.append(", softwareVer=").append(softwareVer);
        sb.append(", systemVer=").append(systemVer);
        sb.append(", cpu=").append(cpu);
        sb.append(", memory=").append(memory);
        sb.append(", hdisk=").append(hdisk);
        sb.append(", netCard=").append(netCard);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}