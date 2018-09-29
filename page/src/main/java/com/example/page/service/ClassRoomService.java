package com.example.page.service;

import com.example.page.entity.ClassRoom;
import com.example.page.entity.ClassRoomExample;
import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClassRoomService {

    PageInfo<ClassRoom> selectByExample(Pageable pager, ClassRoomExample example);

    List<ClassRoom> selectByExample(ClassRoomExample example);

    ClassRoom selectByPrimaryKey(String id);
}
