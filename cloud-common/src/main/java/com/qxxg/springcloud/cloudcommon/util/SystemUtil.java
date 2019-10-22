package com.qxxg.springcloud.cloudcommon.util;

/**
 * @Author SmallSand
 * @Date 2019/8/22  9:50
 * 系统工具类
 */
public class SystemUtil {

    //雪花ID生成器
    private  static SnowFlake snowFlake = new SnowFlake(1, 1);

    //获取Id
    public static Long getId(){
        return snowFlake.nextId();
    }
}
