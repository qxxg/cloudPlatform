package com.qxxg.springcloud.cloudmbg.mapper;

import com.qxxg.springcloud.cloudmbg.entity.TerminalLoginLog;
import com.qxxg.springcloud.cloudmbg.entity.TerminalLoginLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TerminalLoginLogMapper {
    long countByExample(TerminalLoginLogExample example);

    int deleteByExample(TerminalLoginLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TerminalLoginLog record);

    int insertSelective(TerminalLoginLog record);

    List<TerminalLoginLog> selectByExample(TerminalLoginLogExample example);

    TerminalLoginLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TerminalLoginLog record, @Param("example") TerminalLoginLogExample example);

    int updateByExample(@Param("record") TerminalLoginLog record, @Param("example") TerminalLoginLogExample example);

    int updateByPrimaryKeySelective(TerminalLoginLog record);

    int updateByPrimaryKey(TerminalLoginLog record);
}