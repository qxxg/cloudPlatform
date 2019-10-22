package com.qxxg.springcloud.cloudmbg.mapper;


import java.util.List;

import com.qxxg.springcloud.cloudmbg.entity.ConnectLog;
import com.qxxg.springcloud.cloudmbg.entity.ConnectLogExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ConnectLogMapper {
    long countByExample(ConnectLogExample example);

    int deleteByExample(ConnectLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConnectLog record);

    int insertSelective(ConnectLog record);

    List<ConnectLog> selectByExample(ConnectLogExample example);

    ConnectLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConnectLog record, @Param("example") ConnectLogExample example);

    int updateByExample(@Param("record") ConnectLog record, @Param("example") ConnectLogExample example);

    int updateByPrimaryKeySelective(ConnectLog record);

    int updateByPrimaryKey(ConnectLog record);
}