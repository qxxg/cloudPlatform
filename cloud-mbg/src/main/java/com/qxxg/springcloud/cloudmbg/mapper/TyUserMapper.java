package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.TyUser;
import com.qxxg.springcloud.cloudmbg.entity.TyUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TyUserMapper {
    long countByExample(TyUserExample example);

    int deleteByExample(TyUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TyUser record);

    int insertSelective(TyUser record);

    List<TyUser> selectByExample(TyUserExample example);

    TyUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TyUser record, @Param("example") TyUserExample example);

    int updateByExample(@Param("record") TyUser record, @Param("example") TyUserExample example);

    int updateByPrimaryKeySelective(TyUser record);

    int updateByPrimaryKey(TyUser record);
}