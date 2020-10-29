package com.example.upc.dataobject;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class InspectAssistBook {
    private Integer id;
    private Integer parentId;
    private String assistNumber;
    @NotBlank(message = ("当事人不能为空"))
    private String concernedPerson;
    private String businessAddress;
    private String actionCause;
    private String desicionFileNumber;
    private String listFileNumber;
    private String contactPerson;
    private String contactPhone;
    private Date operateTime;
    private String operateIp;
    private String operator;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.id
     *
     * @return the value of inspect_assist_book.id
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.id
     *
     * @param id the value for inspect_assist_book.id
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.parent_id
     *
     * @return the value of inspect_assist_book.parent_id
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.parent_id
     *
     * @param parentId the value for inspect_assist_book.parent_id
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.assist_number
     *
     * @return the value of inspect_assist_book.assist_number
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getAssistNumber() {
        return assistNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.assist_number
     *
     * @param assistNumber the value for inspect_assist_book.assist_number
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setAssistNumber(String assistNumber) {
        this.assistNumber = assistNumber == null ? null : assistNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.concerned_person
     *
     * @return the value of inspect_assist_book.concerned_person
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getConcernedPerson() {
        return concernedPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.concerned_person
     *
     * @param concernedPerson the value for inspect_assist_book.concerned_person
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setConcernedPerson(String concernedPerson) {
        this.concernedPerson = concernedPerson == null ? null : concernedPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.business_address
     *
     * @return the value of inspect_assist_book.business_address
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getBusinessAddress() {
        return businessAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.business_address
     *
     * @param businessAddress the value for inspect_assist_book.business_address
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress == null ? null : businessAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.action_cause
     *
     * @return the value of inspect_assist_book.action_cause
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getActionCause() {
        return actionCause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.action_cause
     *
     * @param actionCause the value for inspect_assist_book.action_cause
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setActionCause(String actionCause) {
        this.actionCause = actionCause == null ? null : actionCause.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.desicion_file_number
     *
     * @return the value of inspect_assist_book.desicion_file_number
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getDesicionFileNumber() {
        return desicionFileNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.desicion_file_number
     *
     * @param desicionFileNumber the value for inspect_assist_book.desicion_file_number
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setDesicionFileNumber(String desicionFileNumber) {
        this.desicionFileNumber = desicionFileNumber == null ? null : desicionFileNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.list_file_number
     *
     * @return the value of inspect_assist_book.list_file_number
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getListFileNumber() {
        return listFileNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.list_file_number
     *
     * @param listFileNumber the value for inspect_assist_book.list_file_number
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setListFileNumber(String listFileNumber) {
        this.listFileNumber = listFileNumber == null ? null : listFileNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.contact_person
     *
     * @return the value of inspect_assist_book.contact_person
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.contact_person
     *
     * @param contactPerson the value for inspect_assist_book.contact_person
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson == null ? null : contactPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.contact_phone
     *
     * @return the value of inspect_assist_book.contact_phone
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.contact_phone
     *
     * @param contactPhone the value for inspect_assist_book.contact_phone
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.operate_time
     *
     * @return the value of inspect_assist_book.operate_time
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.operate_time
     *
     * @param operateTime the value for inspect_assist_book.operate_time
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.operate_ip
     *
     * @return the value of inspect_assist_book.operate_ip
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getOperateIp() {
        return operateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.operate_ip
     *
     * @param operateIp the value for inspect_assist_book.operate_ip
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inspect_assist_book.operator
     *
     * @return the value of inspect_assist_book.operator
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inspect_assist_book.operator
     *
     * @param operator the value for inspect_assist_book.operator
     *
     * @mbg.generated Fri Aug 30 21:03:34 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}