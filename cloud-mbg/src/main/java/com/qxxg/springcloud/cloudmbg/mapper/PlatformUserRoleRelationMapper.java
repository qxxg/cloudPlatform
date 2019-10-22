package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.PlatformUserRoleRelation;
import com.qxxg.springcloud.cloudmbg.entity.PlatformUserRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PlatformUserRoleRelationMapper {
    long countByExample(PlatformUserRoleRelationExample example);

    int deleteByExample(PlatformUserRoleRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlatformUserRoleRelation record);

    int insertSelective(PlatformUserRoleRelation record);

    List<PlatformUserRoleRelation> selectByExample(PlatformUserRoleRelationExample example);

    PlatformUserRoleRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlatformUserRoleRelation record, @Param("example") PlatformUserRoleRelationExample example);

    int updateByExample(@Param("record") PlatformUserRoleRelation record, @Param("example") PlatformUserRoleRelationExample example);

    int updateByPrimaryKeySelective(PlatformUserRoleRelation record);

    int updateByPrimaryKey(PlatformUserRoleRelation record);
}