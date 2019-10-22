package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.VipUserPk;
import com.qxxg.springcloud.cloudmbg.entity.VipUserPkExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VipUserPkMapper {
    long countByExample(VipUserPkExample example);

    int deleteByExample(VipUserPkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VipUserPk record);

    int insertSelective(VipUserPk record);

    List<VipUserPk> selectByExample(VipUserPkExample example);

    VipUserPk selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VipUserPk record, @Param("example") VipUserPkExample example);

    int updateByExample(@Param("record") VipUserPk record, @Param("example") VipUserPkExample example);

    int updateByPrimaryKeySelective(VipUserPk record);

    int updateByPrimaryKey(VipUserPk record);
}