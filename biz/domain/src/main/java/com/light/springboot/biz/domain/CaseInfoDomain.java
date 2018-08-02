package com.light.springboot.biz.domain;

import java.util.Date;

/**
 * Created by zhaodongjun on 2018/7/11 0011.
 */
public class CaseInfoDomain {
    private Integer id;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 企业信息id
     */
    private String bbdQyxxId;

    /**
     * 操作类型码（01：添加黑名单，02：添加关联方风险分）
     */
    private String operateType;

    /**
     * 案件类型码（01：刑事案件，02：行政案件）；当操作类型码为02时，此项必填
     */
    private String caseType;

    /**
     * 加入黑名单日期，date类型YYYY-MM-DD；当操作类型码为01时，此项必填
     */
    private String joinDate;

    /**
     * 加入黑名单原因；操作类型码为01时，此项必填
     */
    private String joinReason;

    /**
     * 加入黑名单来源；操作类型码为01时，此项必填
     */
    private String joinSource;

    private Date gmtCreate;

    private Date gmtModified;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取公司名称
     *
     * @return company_name - 公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置公司名称
     *
     * @param companyName 公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 获取企业信息id
     *
     * @return bbd_qyxx_id - 企业信息id
     */
    public String getBbdQyxxId() {
        return bbdQyxxId;
    }

    /**
     * 设置企业信息id
     *
     * @param bbdQyxxId 企业信息id
     */
    public void setBbdQyxxId(String bbdQyxxId) {
        this.bbdQyxxId = bbdQyxxId == null ? null : bbdQyxxId.trim();
    }

    /**
     * 获取操作类型码（01：添加黑名单，02：添加关联方风险分）
     *
     * @return operate_type - 操作类型码（01：添加黑名单，02：添加关联方风险分）
     */
    public String getOperateType() {
        return operateType;
    }

    /**
     * 设置操作类型码（01：添加黑名单，02：添加关联方风险分）
     *
     * @param operateType 操作类型码（01：添加黑名单，02：添加关联方风险分）
     */
    public void setOperateType(String operateType) {
        this.operateType = operateType == null ? null : operateType.trim();
    }

    /**
     * 获取案件类型码（01：刑事案件，02：行政案件）；当操作类型码为02时，此项必填
     *
     * @return case_type - 案件类型码（01：刑事案件，02：行政案件）；当操作类型码为02时，此项必填
     */
    public String getCaseType() {
        return caseType;
    }

    /**
     * 设置案件类型码（01：刑事案件，02：行政案件）；当操作类型码为02时，此项必填
     *
     * @param caseType 案件类型码（01：刑事案件，02：行政案件）；当操作类型码为02时，此项必填
     */
    public void setCaseType(String caseType) {
        this.caseType = caseType == null ? null : caseType.trim();
    }

    /**
     * 获取加入黑名单日期，date类型YYYY-MM-DD；当操作类型码为01时，此项必填
     *
     * @return Join_date - 加入黑名单日期，date类型YYYY-MM-DD；当操作类型码为01时，此项必填
     */
    public String getJoinDate() {
        return joinDate;
    }

    /**
     * 设置加入黑名单日期，date类型YYYY-MM-DD；当操作类型码为01时，此项必填
     *
     * @param joinDate 加入黑名单日期，date类型YYYY-MM-DD；当操作类型码为01时，此项必填
     */
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate == null ? null : joinDate.trim();
    }

    /**
     * 获取加入黑名单原因；操作类型码为01时，此项必填
     *
     * @return Join_reason - 加入黑名单原因；操作类型码为01时，此项必填
     */
    public String getJoinReason() {
        return joinReason;
    }

    /**
     * 设置加入黑名单原因；操作类型码为01时，此项必填
     *
     * @param joinReason 加入黑名单原因；操作类型码为01时，此项必填
     */
    public void setJoinReason(String joinReason) {
        this.joinReason = joinReason == null ? null : joinReason.trim();
    }

    /**
     * 获取加入黑名单来源；操作类型码为01时，此项必填
     *
     * @return Join_source - 加入黑名单来源；操作类型码为01时，此项必填
     */
    public String getJoinSource() {
        return joinSource;
    }

    /**
     * 设置加入黑名单来源；操作类型码为01时，此项必填
     *
     * @param joinSource 加入黑名单来源；操作类型码为01时，此项必填
     */
    public void setJoinSource(String joinSource) {
        this.joinSource = joinSource == null ? null : joinSource.trim();
    }

    /**
     * @return gmt_create
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * @return gmt_modified
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * @param gmtModified
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}