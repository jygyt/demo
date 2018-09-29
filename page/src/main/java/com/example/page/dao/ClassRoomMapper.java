package com.example.page.dao;

import com.example.page.entity.ClassRoom;
import com.example.page.entity.ClassRoomExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
public interface ClassRoomMapper {
    int countByExample(ClassRoomExample example);

    int deleteByExample(ClassRoomExample example);

    int deleteByPrimaryKey(String id);

    int insert(ClassRoom record);

    int insertSelective(ClassRoom record);

    List<ClassRoom> selectByExample(ClassRoomExample example);

    ClassRoom selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ClassRoom record, @Param("example") ClassRoomExample example);

    int updateByExample(@Param("record") ClassRoom record, @Param("example") ClassRoomExample example);

    int updateByPrimaryKeySelective(ClassRoom record);

    int updateByPrimaryKey(ClassRoom record);
}