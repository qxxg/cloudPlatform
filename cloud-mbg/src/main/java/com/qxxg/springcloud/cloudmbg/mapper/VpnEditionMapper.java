package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.VpnEdition;
import com.qxxg.springcloud.cloudmbg.entity.VpnEditionExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VpnEditionMapper {
    long countByExample(VpnEditionExample example);

    int deleteByExample(VpnEditionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VpnEdition record);

    int insertSelective(VpnEdition record);

    List<VpnEdition> selectByExample(VpnEditionExample example);

    VpnEdition selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VpnEdition record, @Param("example") VpnEditionExample example);

    int updateByExample(@Param("record") VpnEdition record, @Param("example") VpnEditionExample example);

    int updateByPrimaryKeySelective(VpnEdition record);

    int updateByPrimaryKey(VpnEdition record);
}