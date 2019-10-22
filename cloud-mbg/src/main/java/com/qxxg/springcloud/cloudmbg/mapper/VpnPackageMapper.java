package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.VpnPackage;
import com.qxxg.springcloud.cloudmbg.entity.VpnPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VpnPackageMapper {
    long countByExample(VpnPackageExample example);

    int deleteByExample(VpnPackageExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VpnPackage record);

    int insertSelective(VpnPackage record);

    List<VpnPackage> selectByExample(VpnPackageExample example);

    VpnPackage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VpnPackage record, @Param("example") VpnPackageExample example);

    int updateByExample(@Param("record") VpnPackage record, @Param("example") VpnPackageExample example);

    int updateByPrimaryKeySelective(VpnPackage record);

    int updateByPrimaryKey(VpnPackage record);
}