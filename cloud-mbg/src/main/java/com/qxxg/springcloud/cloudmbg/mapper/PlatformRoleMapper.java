package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.PlatformRole;
import com.qxxg.springcloud.cloudmbg.entity.PlatformRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PlatformRoleMapper {
    long countByExample(PlatformRoleExample example);

    int deleteByExample(PlatformRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlatformRole record);

    int insertSelective(PlatformRole record);

    List<PlatformRole> selectByExample(PlatformRoleExample example);

    PlatformRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlatformRole record, @Param("example") PlatformRoleExample example);

    int updateByExample(@Param("record") PlatformRole record, @Param("example") PlatformRoleExample example);

    int updateByPrimaryKeySelective(PlatformRole record);

    int updateByPrimaryKey(PlatformRole record);
}