package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.FlywaySchemaHistory;
import com.qxxg.springcloud.cloudmbg.entity.FlywaySchemaHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FlywaySchemaHistoryMapper {
    long countByExample(FlywaySchemaHistoryExample example);

    int deleteByExample(FlywaySchemaHistoryExample example);

    int deleteByPrimaryKey(Integer installedRank);

    int insert(FlywaySchemaHistory record);

    int insertSelective(FlywaySchemaHistory record);

    List<FlywaySchemaHistory> selectByExample(FlywaySchemaHistoryExample example);

    FlywaySchemaHistory selectByPrimaryKey(Integer installedRank);

    int updateByExampleSelective(@Param("record") FlywaySchemaHistory record, @Param("example") FlywaySchemaHistoryExample example);

    int updateByExample(@Param("record") FlywaySchemaHistory record, @Param("example") FlywaySchemaHistoryExample example);

    int updateByPrimaryKeySelective(FlywaySchemaHistory record);

    int updateByPrimaryKey(FlywaySchemaHistory record);
}