package com.example.upc.dataobject;

import java.util.Date;

public class ComplaintProblemTypeTwo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column complaint_problem_type_two.id
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column complaint_problem_type_two.one_type
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    private String oneType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column complaint_problem_type_two.type
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column complaint_problem_type_two.operator
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column complaint_problem_type_two.operator_ip
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column complaint_problem_type_two.operator_time
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column complaint_problem_type_two.id
     *
     * @return the value of complaint_problem_type_two.id
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column complaint_problem_type_two.id
     *
     * @param id the value for complaint_problem_type_two.id
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column complaint_problem_type_two.one_type
     *
     * @return the value of complaint_problem_type_two.one_type
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    public String getOneType() {
        return oneType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column complaint_problem_type_two.one_type
     *
     * @param oneType the value for complaint_problem_type_two.one_type
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    public void setOneType(String oneType) {
        this.oneType = oneType == null ? null : oneType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column complaint_problem_type_two.type
     *
     * @return the value of complaint_problem_type_two.type
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column complaint_problem_type_two.type
     *
     * @param type the value for complaint_problem_type_two.type
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column complaint_problem_type_two.operator
     *
     * @return the value of complaint_problem_type_two.operator
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column complaint_problem_type_two.operator
     *
     * @param operator the value for complaint_problem_type_two.operator
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column complaint_problem_type_two.operator_ip
     *
     * @return the value of complaint_problem_type_two.operator_ip
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column complaint_problem_type_two.operator_ip
     *
     * @param operatorIp the value for complaint_problem_type_two.operator_ip
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column complaint_problem_type_two.operator_time
     *
     * @return the value of complaint_problem_type_two.operator_time
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column complaint_problem_type_two.operator_time
     *
     * @param operatorTime the value for complaint_problem_type_two.operator_time
     *
     * @mbg.generated Tue Sep 10 10:50:29 CST 2019
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}