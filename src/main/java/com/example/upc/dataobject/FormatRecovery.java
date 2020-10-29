package com.example.upc.dataobject;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class FormatRecovery {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_recovery.id
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_recovery.enterprise_id
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    private Integer enterpriseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_recovery.enterprise_name
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    private String enterpriseName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_recovery.area_id
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    private Integer areaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_recovery.recovery_enterprise
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    @NotBlank(message = "回收企业名称不能为空")
    private String recoveryEnterprise;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_recovery.charger
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    @NotBlank(message = "负责人不能为空")
    private String charger;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_recovery.address
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    @NotBlank(message = "地址不能为空")
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_recovery.phone
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    @NotBlank(message = "联系电话不能为空")
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_recovery.operator
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_recovery.operator_ip
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column format_recovery.operator_time
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_recovery.id
     *
     * @return the value of format_recovery.id
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_recovery.id
     *
     * @param id the value for format_recovery.id
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_recovery.enterprise_id
     *
     * @return the value of format_recovery.enterprise_id
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_recovery.enterprise_id
     *
     * @param enterpriseId the value for format_recovery.enterprise_id
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_recovery.enterprise_name
     *
     * @return the value of format_recovery.enterprise_name
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_recovery.enterprise_name
     *
     * @param enterpriseName the value for format_recovery.enterprise_name
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName == null ? null : enterpriseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_recovery.area_id
     *
     * @return the value of format_recovery.area_id
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_recovery.area_id
     *
     * @param areaId the value for format_recovery.area_id
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_recovery.recovery_enterprise
     *
     * @return the value of format_recovery.recovery_enterprise
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public String getRecoveryEnterprise() {
        return recoveryEnterprise;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_recovery.recovery_enterprise
     *
     * @param recoveryEnterprise the value for format_recovery.recovery_enterprise
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public void setRecoveryEnterprise(String recoveryEnterprise) {
        this.recoveryEnterprise = recoveryEnterprise == null ? null : recoveryEnterprise.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_recovery.charger
     *
     * @return the value of format_recovery.charger
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public String getCharger() {
        return charger;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_recovery.charger
     *
     * @param charger the value for format_recovery.charger
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public void setCharger(String charger) {
        this.charger = charger == null ? null : charger.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_recovery.address
     *
     * @return the value of format_recovery.address
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_recovery.address
     *
     * @param address the value for format_recovery.address
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_recovery.phone
     *
     * @return the value of format_recovery.phone
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_recovery.phone
     *
     * @param phone the value for format_recovery.phone
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_recovery.operator
     *
     * @return the value of format_recovery.operator
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_recovery.operator
     *
     * @param operator the value for format_recovery.operator
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_recovery.operator_ip
     *
     * @return the value of format_recovery.operator_ip
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_recovery.operator_ip
     *
     * @param operatorIp the value for format_recovery.operator_ip
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column format_recovery.operator_time
     *
     * @return the value of format_recovery.operator_time
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column format_recovery.operator_time
     *
     * @param operatorTime the value for format_recovery.operator_time
     *
     * @mbg.generated Fri Oct 18 20:20:09 CST 2019
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}