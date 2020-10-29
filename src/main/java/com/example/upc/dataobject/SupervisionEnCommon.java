package com.example.upc.dataobject;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class SupervisionEnCommon {
    private Integer id;
    private Integer enterpriseId;
    @NotBlank(message = "证号不能为空")
    private String number;
    @NotNull(message = "发证日期不能为空")
    private Date giveTime;
    @NotNull(message = "开始日期不能为空")
    private Date startTime;
    @NotNull(message = "结束日期不能为空")
    private Date endTime;
    private Float validityAge;
    @NotBlank(message = "类别不能为空")
    private String businessType;
    @NotBlank(message = "发证机关不能为空")
    private String licenseAuthority;
    private String remark;
    private Date operateTime;
    private String operateIp;
    private String operator;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.id
     *
     * @return the value of supervision_en_common.id
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.id
     *
     * @param id the value for supervision_en_common.id
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.enterprise_id
     *
     * @return the value of supervision_en_common.enterprise_id
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.enterprise_id
     *
     * @param enterpriseId the value for supervision_en_common.enterprise_id
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.number
     *
     * @return the value of supervision_en_common.number
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.number
     *
     * @param number the value for supervision_en_common.number
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.give_time
     *
     * @return the value of supervision_en_common.give_time
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public Date getGiveTime() {
        return giveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.give_time
     *
     * @param giveTime the value for supervision_en_common.give_time
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setGiveTime(Date giveTime) {
        this.giveTime = giveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.start_time
     *
     * @return the value of supervision_en_common.start_time
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.start_time
     *
     * @param startTime the value for supervision_en_common.start_time
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.end_time
     *
     * @return the value of supervision_en_common.end_time
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.end_time
     *
     * @param endTime the value for supervision_en_common.end_time
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.validity_age
     *
     * @return the value of supervision_en_common.validity_age
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public Float getValidityAge() {
        return validityAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.validity_age
     *
     * @param validityAge the value for supervision_en_common.validity_age
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setValidityAge(Float validityAge) {
        this.validityAge = validityAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.business_type
     *
     * @return the value of supervision_en_common.business_type
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.business_type
     *
     * @param businessType the value for supervision_en_common.business_type
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.license_authority
     *
     * @return the value of supervision_en_common.license_authority
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public String getLicenseAuthority() {
        return licenseAuthority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.license_authority
     *
     * @param licenseAuthority the value for supervision_en_common.license_authority
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setLicenseAuthority(String licenseAuthority) {
        this.licenseAuthority = licenseAuthority == null ? null : licenseAuthority.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.remark
     *
     * @return the value of supervision_en_common.remark
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.remark
     *
     * @param remark the value for supervision_en_common.remark
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.operate_time
     *
     * @return the value of supervision_en_common.operate_time
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.operate_time
     *
     * @param operateTime the value for supervision_en_common.operate_time
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.operate_ip
     *
     * @return the value of supervision_en_common.operate_ip
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public String getOperateIp() {
        return operateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.operate_ip
     *
     * @param operateIp the value for supervision_en_common.operate_ip
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supervision_en_common.operator
     *
     * @return the value of supervision_en_common.operator
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supervision_en_common.operator
     *
     * @param operator the value for supervision_en_common.operator
     *
     * @mbg.generated Mon Jul 01 11:33:32 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}