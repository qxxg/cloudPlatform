package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.VpnOrder;
import com.qxxg.springcloud.cloudmbg.entity.VpnOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VpnOrderMapper {
    long countByExample(VpnOrderExample example);

    int deleteByExample(VpnOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VpnOrder record);

    int insertSelective(VpnOrder record);

    List<VpnOrder> selectByExample(VpnOrderExample example);

    VpnOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VpnOrder record, @Param("example") VpnOrderExample example);

    int updateByExample(@Param("record") VpnOrder record, @Param("example") VpnOrderExample example);

    int updateByPrimaryKeySelective(VpnOrder record);

    int updateByPrimaryKey(VpnOrder record);
}