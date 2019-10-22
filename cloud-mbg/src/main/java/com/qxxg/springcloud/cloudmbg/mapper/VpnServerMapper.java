package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.VpnServer;
import com.qxxg.springcloud.cloudmbg.entity.VpnServerExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VpnServerMapper {
    long countByExample(VpnServerExample example);

    int deleteByExample(VpnServerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VpnServer record);

    int insertSelective(VpnServer record);

    List<VpnServer> selectByExample(VpnServerExample example);

    VpnServer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VpnServer record, @Param("example") VpnServerExample example);

    int updateByExample(@Param("record") VpnServer record, @Param("example") VpnServerExample example);

    int updateByPrimaryKeySelective(VpnServer record);

    int updateByPrimaryKey(VpnServer record);
}