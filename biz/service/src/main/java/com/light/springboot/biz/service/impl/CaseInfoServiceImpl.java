package com.light.springboot.biz.service.impl;

import com.light.springboot.biz.domain.CaseInfoDomain;
import com.light.springboot.biz.domain.dao.CaseInfoMapper;
import com.light.springboot.biz.domain.model.CaseInfo;
import com.light.springboot.biz.service.CaseInfoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaodongjun on 2018/7/11 0011.
 */
@Service
public class CaseInfoServiceImpl implements CaseInfoService {
    @Autowired
    private CaseInfoMapper caseInfoMapper;
    @Override
    public void addCaseInfo(CaseInfoDomain caseInfoDomain) {
        CaseInfo caseInfo = new CaseInfo();
        BeanUtils.copyProperties(caseInfoDomain,caseInfo);
        caseInfoMapper.insert(caseInfo);

    }
}
