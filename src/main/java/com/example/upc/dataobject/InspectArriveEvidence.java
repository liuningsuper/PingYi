package com.example.upc.dataobject;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class InspectArriveEvidence {
    private Integer id;
    private Integer parentId;
    private String arriveFile;
    @NotBlank(message = "受送达人不能为空")
    private String arrivePerson;
    private Date arriveDate;
    private String arriveWay;
    private String arriveAddress;
    private String remark;
    private Date operateTime;
    private String operateIp;
    private String operator;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_arrive_evidence.id
     *
     * @return the value of inspect_arrive_evidence.id
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_arrive_evidence.id
     *
     * @param id the value for inspect_arrive_evidence.id
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_arrive_evidence.parent_id
     *
     * @return the value of inspect_arrive_evidence.parent_id
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_arrive_evidence.parent_id
     *
     * @param parentId the value for inspect_arrive_evidence.parent_id
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_arrive_evidence.arrive_file
     *
     * @return the value of inspect_arrive_evidence.arrive_file
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getArriveFile() {
        return arriveFile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_arrive_evidence.arrive_file
     *
     * @param arriveFile the value for inspect_arrive_evidence.arrive_file
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setArriveFile(String arriveFile) {
        this.arriveFile = arriveFile == null ? null : arriveFile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_arrive_evidence.arrive_person
     *
     * @return the value of inspect_arrive_evidence.arrive_person
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getArrivePerson() {
        return arrivePerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_arrive_evidence.arrive_person
     *
     * @param arrivePerson the value for inspect_arrive_evidence.arrive_person
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setArrivePerson(String arrivePerson) {
        this.arrivePerson = arrivePerson == null ? null : arrivePerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_arrive_evidence.arrive_date
     *
     * @return the value of inspect_arrive_evidence.arrive_date
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public Date getArriveDate() {
        return arriveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_arrive_evidence.arrive_date
     *
     * @param arriveDate the value for inspect_arrive_evidence.arrive_date
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_arrive_evidence.arrive_way
     *
     * @return the value of inspect_arrive_evidence.arrive_way
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getArriveWay() {
        return arriveWay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_arrive_evidence.arrive_way
     *
     * @param arriveWay the value for inspect_arrive_evidence.arrive_way
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setArriveWay(String arriveWay) {
        this.arriveWay = arriveWay == null ? null : arriveWay.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_arrive_evidence.arrive_address
     *
     * @return the value of inspect_arrive_evidence.arrive_address
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getArriveAddress() {
        return arriveAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_arrive_evidence.arrive_address
     *
     * @param arriveAddress the value for inspect_arrive_evidence.arrive_address
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setArriveAddress(String arriveAddress) {
        this.arriveAddress = arriveAddress == null ? null : arriveAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_arrive_evidence.remark
     *
     * @return the value of inspect_arrive_evidence.remark
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_arrive_evidence.remark
     *
     * @param remark the value for inspect_arrive_evidence.remark
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_arrive_evidence.operate_time
     *
     * @return the value of inspect_arrive_evidence.operate_time
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_arrive_evidence.operate_time
     *
     * @param operateTime the value for inspect_arrive_evidence.operate_time
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_arrive_evidence.operate_ip
     *
     * @return the value of inspect_arrive_evidence.operate_ip
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getOperateIp() {
        return operateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_arrive_evidence.operate_ip
     *
     * @param operateIp the value for inspect_arrive_evidence.operate_ip
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_arrive_evidence.operator
     *
     * @return the value of inspect_arrive_evidence.operator
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_arrive_evidence.operator
     *
     * @param operator the value for inspect_arrive_evidence.operator
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}