package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.PlatformUser;
import com.qxxg.springcloud.cloudmbg.entity.PlatformUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PlatformUserMapper {
    long countByExample(PlatformUserExample example);

    int deleteByExample(PlatformUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PlatformUser record);

    int insertSelective(PlatformUser record);

    List<PlatformUser> selectByExample(PlatformUserExample example);

    PlatformUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PlatformUser record, @Param("example") PlatformUserExample example);

    int updateByExample(@Param("record") PlatformUser record, @Param("example") PlatformUserExample example);

    int updateByPrimaryKeySelective(PlatformUser record);

    int updateByPrimaryKey(PlatformUser record);
}