package com.zy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zy.mapper.AgreementMapper;
import com.zy.mapper.GraduateMapper;
import com.zy.model.Graduate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @ClassName GraduateController
 * @Description TODO
 * @Author ZY
 * @Date2020/8/31 22:15
 * @Version 1.0
 **/
@RestController
@RequestMapping("/graduate")
public class GraduateController {

    @Autowired
    GraduateMapper graduateMapper;
    private static final Logger logger = LoggerFactory.getLogger(GraduateController.class.getName());
    @GetMapping("/graduates")
    public String getGraduates() {
        List<Graduate> list = graduateMapper.showAllGrad();
        String result = JSON.toJSONString(list);
        logger.info(result);
        JSONObject obj=new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count",1000);
        obj.put("data",list);
        return obj.toJSONString();
    }

    @RequestMapping(value = "/searchNum/{num}", method = RequestMethod.GET)
    public Graduate searchNum(@PathVariable String num) {
        return graduateMapper.searchNum(num);
    }

    @RequestMapping(value = "/searchId/{id}", method = RequestMethod.GET)
    public Graduate searchId(@PathVariable String id) {
        return graduateMapper.searchId(id);
    }

    @RequestMapping(value = "/searchName/{name}", method = RequestMethod.GET)
    public Graduate searchName(@PathVariable String name) {
        return graduateMapper.searchName(name);
    }

    @RequestMapping(value = "/insert/{num}/{id}/{name}/{age}/{phone}/{academy}/{major}", method = RequestMethod.GET)
    public String insertGradu(@PathVariable String num, @PathVariable String id, @PathVariable String name, @PathVariable int age, @PathVariable String phone, @PathVariable String academy, @PathVariable String major) {
        int flag = graduateMapper.insertGraduate(num, id, name, age, phone, academy, major);
        if (flag == 1) {
            return "Inserte succeed!";
        }
        return "Insert failed!";
    }

    @RequestMapping(value = "/deleteid/{id}", method = RequestMethod.GET)
    public String deleteGraduId(@PathVariable String id) {
        int flag = graduateMapper.deleteGraduateId(id);
        if (flag == 1) {
            return "Delete succeed!";
        }
        return "Delete failed!";
    }

    @RequestMapping(value = "/deletenum/{num}", method = RequestMethod.GET)
    public String deleteGraduNum(@PathVariable String num) {
        int flag = graduateMapper.deleteGraduateNum(num);
        if (flag == 1) {
            return "Delete succeed!";
        }
        return "Delete failed!";
    }

    @RequestMapping(value = "/deletename/{name}", method = RequestMethod.GET)
    public String deleteGraduName(@PathVariable String name) {
        int flag = graduateMapper.deleteGraduateName(name);
        if (flag == 1) {
            return "Delete succeed!";
        }
        return "Delete failed!";
    }

    @RequestMapping(value = "/updateNum/{num}/{name}/{age}/{phone}/{academy}/{major}", method = RequestMethod.GET)
    public String updateGraduNum(@PathVariable String num, @PathVariable String name, @PathVariable int age, @PathVariable String phone, @PathVariable String academy, @PathVariable String major) {
        int flag = graduateMapper.updateGraduateNum(name, age, phone, academy, major, num);
        if (flag == 1) {
            return "Update succeed!";
        }
        return "Update failed!";
    }
}
