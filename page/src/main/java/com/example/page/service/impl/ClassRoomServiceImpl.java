package com.example.page.service.impl;

import com.example.page.dao.ClassRoomMapper;
import com.example.page.entity.ClassRoom;
import com.example.page.entity.ClassRoomExample;
import com.example.page.service.ClassRoomService;
import com.example.page.web.ClassRoomController;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassRoomServiceImpl.class);

    @Autowired
    ClassRoomMapper classRoomMapper;

    @Override
    public PageInfo<ClassRoom> selectByExample(Pageable pager, ClassRoomExample example){
        PageHelper.startPage(pager.getPageNumber(), pager.getPageSize());
        List<ClassRoom> list=classRoomMapper.selectByExample(example);
        PageInfo<ClassRoom> pageInfo= new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<ClassRoom> selectByExample(ClassRoomExample example){
        return classRoomMapper.selectByExample(example);
    }

    @Override
    public ClassRoom selectByPrimaryKey(String id){
        LOGGER.info("========id=========="+id);
        return classRoomMapper.selectByPrimaryKey(id);
    }

//    @Override
//    public List<Item> findItemByPage(int currentPage,int pageSize) {
//        //设置分页信息，分别是当前页数和每页显示的总记录数【记住：必须在mapper接口中的方法执行之前设置该分页信息】
//        PageHelper.startPage(currentPage, pageSize);
//
//        List<Item> allItems = itemMapper.findAll();        //全部商品
//        int countNums = itemMapper.countItem();            //总记录数
//        PageBean<Item> pageData = new PageBean<>(currentPage, pageSize, countNums);
//        pageData.setItems(allItems);
//        return pageData.getItems();
//    }

}
