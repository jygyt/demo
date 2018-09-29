package com.example.page.web;

import com.alibaba.fastjson.JSONObject;
import com.example.page.entity.ClassRoom;
import com.example.page.entity.ClassRoomExample;
import com.example.page.service.ClassRoomService;
import com.github.pagehelper.PageInfo;
//import com.yunzainfo.cloud.common.util.PageUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ClassRoomController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassRoomController.class);

    @Autowired
    ClassRoomService classRoomService;


    @RequestMapping(value = "/queryListForPage", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<PageInfo<?>> queryListForPage(@PageableDefault(value=20) Pageable pager, HttpServletRequest request){

        LOGGER.info("=========pager==========",pager);

        try {
//            JSONObject pageParam= (JSONObject) request.getAttribute("pageParam");
            ClassRoomExample example = new ClassRoomExample();
            ClassRoomExample.Criteria criteria = example.createCriteria();
            criteria.andIdIsNotNull();
            PageInfo<ClassRoom> pageInfo=classRoomService.selectByExample(pager,example);
            return ResponseEntity.ok().body(pageInfo);
        } catch (Exception e) {
            LOGGER.error("查询教室信息出错");
            throw e;
        }

    }


    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<ClassRoom> selectByExample(){
        ClassRoomExample classRoomExample=new ClassRoomExample();
        ClassRoomExample.Criteria criteria = classRoomExample.createCriteria();
        criteria.andIdIsNotNull();
        LOGGER.info("=========pager=========="+classRoomExample);
        return classRoomService.selectByExample(classRoomExample);
    }

//    @RequestMapping(value = "/getmessage", method = RequestMethod.GET)
//    public ClassRoom selectByPrimaryKey(@RequestParam(value = "id", required = true) String id){
//        LOGGER.info("=========pager=========="+id);
//        return classRoomService.selectByPrimaryKey(id);
//    }

    @GetMapping("/getmessage/{id}")
    public ClassRoom selectByPrimary(@PathVariable String id){
        LOGGER.info("=========pager=========="+id);
        return classRoomService.selectByPrimaryKey(id);
    }

}
