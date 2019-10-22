package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.VpnNotice;
import com.qxxg.springcloud.cloudmbg.entity.VpnNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface VpnNoticeMapper {
    long countByExample(VpnNoticeExample example);

    int deleteByExample(VpnNoticeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VpnNotice record);

    int insertSelective(VpnNotice record);

    List<VpnNotice> selectByExample(VpnNoticeExample example);

    VpnNotice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VpnNotice record, @Param("example") VpnNoticeExample example);

    int updateByExample(@Param("record") VpnNotice record, @Param("example") VpnNoticeExample example);

    int updateByPrimaryKeySelective(VpnNotice record);

    int updateByPrimaryKey(VpnNotice record);
}