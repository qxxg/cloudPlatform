package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.PlatformRolePermissionRelation;
import com.qxxg.springcloud.cloudmbg.entity.PlatformRolePermissionRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PlatformRolePermissionRelationMapper {
    long countByExample(PlatformRolePermissionRelationExample example);

    int deleteByExample(PlatformRolePermissionRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlatformRolePermissionRelation record);

    int insertSelective(PlatformRolePermissionRelation record);

    List<PlatformRolePermissionRelation> selectByExample(PlatformRolePermissionRelationExample example);

    PlatformRolePermissionRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlatformRolePermissionRelation record, @Param("example") PlatformRolePermissionRelationExample example);

    int updateByExample(@Param("record") PlatformRolePermissionRelation record, @Param("example") PlatformRolePermissionRelationExample example);

    int updateByPrimaryKeySelective(PlatformRolePermissionRelation record);

    int updateByPrimaryKey(PlatformRolePermissionRelation record);
}