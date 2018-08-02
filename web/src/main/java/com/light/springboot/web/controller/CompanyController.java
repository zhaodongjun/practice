package com.light.springboot.web.controller;

import com.light.springboot.biz.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhaodongjun on 2018/5/31 0031.
 */
@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/query/turnover")
    public List<String> getStaffTurnover(){
        List<String> list = companyService.staffTurnover();
        return list;
    }

}
