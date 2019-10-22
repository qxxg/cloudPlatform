package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.UserOperateLog;
import com.qxxg.springcloud.cloudmbg.entity.UserOperateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserOperateLogMapper {
    long countByExample(UserOperateLogExample example);

    int deleteByExample(UserOperateLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserOperateLog record);

    int insertSelective(UserOperateLog record);

    List<UserOperateLog> selectByExample(UserOperateLogExample example);

    UserOperateLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserOperateLog record, @Param("example") UserOperateLogExample example);

    int updateByExample(@Param("record") UserOperateLog record, @Param("example") UserOperateLogExample example);

    int updateByPrimaryKeySelective(UserOperateLog record);

    int updateByPrimaryKey(UserOperateLog record);
}