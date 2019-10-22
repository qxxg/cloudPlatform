package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.PlatformPermission;
import com.qxxg.springcloud.cloudmbg.entity.PlatformPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PlatformPermissionMapper {
    long countByExample(PlatformPermissionExample example);

    int deleteByExample(PlatformPermissionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlatformPermission record);

    int insertSelective(PlatformPermission record);

    List<PlatformPermission> selectByExample(PlatformPermissionExample example);

    PlatformPermission selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlatformPermission record, @Param("example") PlatformPermissionExample example);

    int updateByExample(@Param("record") PlatformPermission record, @Param("example") PlatformPermissionExample example);

    int updateByPrimaryKeySelective(PlatformPermission record);

    int updateByPrimaryKey(PlatformPermission record);
}