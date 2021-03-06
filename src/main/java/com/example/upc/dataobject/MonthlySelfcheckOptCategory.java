package com.example.upc.dataobject;

import java.util.Date;

public class MonthlySelfcheckOptCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_selfcheck_opt_category.id
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_selfcheck_opt_category.category
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_selfcheck_opt_category.page_number
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    private Integer pageNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_selfcheck_opt_category.operator
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_selfcheck_opt_category.operator_ip
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column monthly_selfcheck_opt_category.operator_time
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_selfcheck_opt_category.id
     *
     * @return the value of monthly_selfcheck_opt_category.id
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_selfcheck_opt_category.id
     *
     * @param id the value for monthly_selfcheck_opt_category.id
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_selfcheck_opt_category.category
     *
     * @return the value of monthly_selfcheck_opt_category.category
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_selfcheck_opt_category.category
     *
     * @param category the value for monthly_selfcheck_opt_category.category
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_selfcheck_opt_category.page_number
     *
     * @return the value of monthly_selfcheck_opt_category.page_number
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_selfcheck_opt_category.page_number
     *
     * @param pageNumber the value for monthly_selfcheck_opt_category.page_number
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_selfcheck_opt_category.operator
     *
     * @return the value of monthly_selfcheck_opt_category.operator
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_selfcheck_opt_category.operator
     *
     * @param operator the value for monthly_selfcheck_opt_category.operator
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_selfcheck_opt_category.operator_ip
     *
     * @return the value of monthly_selfcheck_opt_category.operator_ip
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_selfcheck_opt_category.operator_ip
     *
     * @param operatorIp the value for monthly_selfcheck_opt_category.operator_ip
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column monthly_selfcheck_opt_category.operator_time
     *
     * @return the value of monthly_selfcheck_opt_category.operator_time
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column monthly_selfcheck_opt_category.operator_time
     *
     * @param operatorTime the value for monthly_selfcheck_opt_category.operator_time
     *
     * @mbg.generated Wed Oct 07 22:31:18 CST 2020
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}