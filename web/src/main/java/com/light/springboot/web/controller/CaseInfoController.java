package com.light.springboot.web.controller;

import com.light.springboot.biz.domain.CaseInfoDomain;
import com.light.springboot.biz.domain.dto.CaseInfoDTO;
import com.light.springboot.biz.service.CaseInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by zhaodongjun on 2018/7/11 0011.
 */
@Validated
@RestController
public class CaseInfoController {
    @Autowired
    private CaseInfoService caseInfoService;


    @RequestMapping(value = "/api/v1.0/add/caseinfo",method = {RequestMethod.GET})
    public String test(){
        return "test!!!";
    }

    @RequestMapping(value = "/api/v1.0/add/caseinfo",method = {RequestMethod.POST})
    public String addCaseInfo(@RequestBody @Valid CaseInfoDTO caseInfoDTO){
        CaseInfoDomain caseInfoDomain = new CaseInfoDomain();
        BeanUtils.copyProperties(caseInfoDTO,caseInfoDomain);
        caseInfoService.addCaseInfo(caseInfoDomain);
        return "保存成功";
    }
}
