package com.qxxg.springcloud.cloudmbg.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Author SmallSand
 * @Date 2019/10/23  9:54
 */
@Data
public class LogEntity {
    private String content;
    private int type;
    private Date createDate;
    private String createUser;
}
