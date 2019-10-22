package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.PlatformUserPermissionRelation;
import com.qxxg.springcloud.cloudmbg.entity.PlatformUserPermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PlatformUserPermissionRelationMapper {
    long countByExample(PlatformUserPermissionRelationExample example);

    int deleteByExample(PlatformUserPermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlatformUserPermissionRelation record);

    int insertSelective(PlatformUserPermissionRelation record);

    List<PlatformUserPermissionRelation> selectByExample(PlatformUserPermissionRelationExample example);

    PlatformUserPermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlatformUserPermissionRelation record, @Param("example") PlatformUserPermissionRelationExample example);

    int updateByExample(@Param("record") PlatformUserPermissionRelation record, @Param("example") PlatformUserPermissionRelationExample example);

    int updateByPrimaryKeySelective(PlatformUserPermissionRelation record);

    int updateByPrimaryKey(PlatformUserPermissionRelation record);
}