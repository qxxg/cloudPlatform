package com.qxxg.springcloud.cloudmbg.entity;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class VpnNotice implements Serializable {
    @ApiModelProperty(value = "主键")
    private Long id;

    @ApiModelProperty(value = "标题")
    private String noticeTitle;

    @ApiModelProperty(value = "内容")
    private String noticeContent;

    @ApiModelProperty(value = "发布时间")
    private Date publishTime;

    @ApiModelProperty(value = "状态(0:禁用;1:启用)")
    private Integer state;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "类型")
    private Integer noticeType;

    @ApiModelProperty(value = "创建者")
    private String creator;

    @ApiModelProperty(value = "创建者姓名")
    private String creatorName;

    @ApiModelProperty(value = "发布者")
    private String publisher;

    @ApiModelProperty(value = "发布者姓名")
    private String publisherName;

    @ApiModelProperty(value = "有效时间")
    private Date validTime;

    @ApiModelProperty(value = "图片链接")
    private String imgLink;

    @ApiModelProperty(value = "文字链接")
    private String articleLink;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", noticeTitle=").append(noticeTitle);
        sb.append(", noticeContent=").append(noticeContent);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append(", noticeType=").append(noticeType);
        sb.append(", creator=").append(creator);
        sb.append(", creatorName=").append(creatorName);
        sb.append(", publisher=").append(publisher);
        sb.append(", publisherName=").append(publisherName);
        sb.append(", validTime=").append(validTime);
        sb.append(", imgLink=").append(imgLink);
        sb.append(", articleLink=").append(articleLink);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}