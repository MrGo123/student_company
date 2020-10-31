package com.zy.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zy.mapper.AgreementMapper;
import com.zy.model.Agreement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName AgreementController
 * @Description TODO
 * @Author ZY
 * @Date2020/8/31 23:07
 * @Version 1.0
 **/
@RequestMapping("/agreement")
@RestController
public class AgreementController {

    @Autowired
    AgreementMapper agreementMapper;

    @RequestMapping(value = "/agreements", method = RequestMethod.GET)
    public String getAgreement() {
        List<Agreement> list = agreementMapper.showAllAgr();
        String result = JSON.toJSONString(list);
        JSONObject obj=new JSONObject();
        //前台通过key值获得对应的value值
        obj.put("code", 0);
        obj.put("msg", "");
        obj.put("count",1000);
        obj.put("data",list);
        return obj.toJSONString();
    }

    @RequestMapping(value = "/search/{id}", method = RequestMethod.GET)
    public Agreement searchAgreeId(@PathVariable String id) {
        return agreementMapper.searchId(id);
    }

    @RequestMapping(value = "/insert/{id}/{signDate}/{graduateId}/{companyId}/{salary}", method = RequestMethod.GET)
    public String insertAgreemrnt(@PathVariable String id, @PathVariable String signDate, @PathVariable String graduateId, @PathVariable String companyId, @PathVariable int salary) {
        Agreement agreement = new Agreement(id, signDate, graduateId, companyId, salary);
        int flag = agreementMapper.insertAgreement(agreement);
        if (flag == 1) {
            return "Insert succeed!";
        }
        return "Insert failed!";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String deleteAgreement(@PathVariable String id){
        int flag = agreementMapper.deleteAgreement(id);
        if(flag == 1){
            return "Delete succeed!";
        }
        return "Delete failed";
    }

    @RequestMapping(value = "/update/{id}/{signDate}/{graduateId}/{companyId}/{salary}")
    public String updateAgreement(@PathVariable String id, @PathVariable String signDate, @PathVariable String graduateId, @PathVariable String companyId, @PathVariable int salary){
        Agreement agreement = new Agreement(id, signDate, graduateId, companyId, salary);
        int flag = agreementMapper.updateAgreement(agreement);
        if (flag == 1) {
            return "Update succeed!";
        }
        return "Update failed!";
    }
}
