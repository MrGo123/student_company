package com.zy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zy.mapper.CompanyMapper;
import com.zy.model.Company;
import jdk.internal.instrumentation.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.naming.StringRefAddr;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CompanyController
 * @Description TODO
 * @Author ZY
 * @Date2020/8/31 22:54
 * @Version 1.0
 **/
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyMapper companyMapper;

    @GetMapping("/companies")
    public String getCompanies() {
        List<Company> list = companyMapper.showAllCom();
        String result = JSON.toJSONString(list);
        JSONObject obj=new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count",1000);
        obj.put("data",list);
        return obj.toJSONString();
    }

    @RequestMapping(value = "/searchId/{id}", method = RequestMethod.GET)
    public Company searchCompanyId(@PathVariable String id) {
        return companyMapper.searchCompanyId(id);
    }

    @RequestMapping(value = "/searchName/{name}", method = RequestMethod.GET)
    public List<Company> searchCompanyName(@PathVariable String name) {
        return companyMapper.searchCompanyName(name);
    }

    @RequestMapping(value = "/insert/{id}/{name}/{phone}/{addr}", method = RequestMethod.GET)
    public String insertCompany(@PathVariable String id, @PathVariable String name, @PathVariable String phone, @PathVariable String addr) {
        Company company = new Company(id, name, phone, addr);
        int flag = companyMapper.insertCompany(company);
        if (flag == 1) {
            return "Insert succeed!";
        }
        return "Insert Failed!";
    }

    @RequestMapping(value = "/delete/{id}")
    public String deleteCompany(@PathVariable String id) {
        int flag = companyMapper.deleteCompany(id);
        if (flag == 1) {
            return "Delete succeed!";
        }
        return "Delete failed!";
    }
@RequestMapping(value = "/update/{id}/{name}/{phone}/{addr}")
    public String updateCompany(@PathVariable String id,@PathVariable String name,@PathVariable String phone, @PathVariable String addr){
        int flag = companyMapper.updateCompany(id,name,phone,addr);
        if(flag==1){
            return "Update succeed!";
        }
        return "Update failed!";
}
}
