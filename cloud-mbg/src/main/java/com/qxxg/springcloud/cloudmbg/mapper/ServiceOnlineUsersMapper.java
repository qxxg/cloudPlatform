package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.ServiceOnlineUsers;
import com.qxxg.springcloud.cloudmbg.entity.ServiceOnlineUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ServiceOnlineUsersMapper {
    long countByExample(ServiceOnlineUsersExample example);

    int deleteByExample(ServiceOnlineUsersExample example);

    int deleteByPrimaryKey(String ipPort);

    int insert(ServiceOnlineUsers record);

    int insertSelective(ServiceOnlineUsers record);

    List<ServiceOnlineUsers> selectByExample(ServiceOnlineUsersExample example);

    ServiceOnlineUsers selectByPrimaryKey(String ipPort);

    int updateByExampleSelective(@Param("record") ServiceOnlineUsers record, @Param("example") ServiceOnlineUsersExample example);

    int updateByExample(@Param("record") ServiceOnlineUsers record, @Param("example") ServiceOnlineUsersExample example);

    int updateByPrimaryKeySelective(ServiceOnlineUsers record);

    int updateByPrimaryKey(ServiceOnlineUsers record);
}