package com.example.upc.dataobject;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AccompanyRecord {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.id
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.enterprise_id
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private Integer enterpriseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.meal_date
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date mealDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.meal_time
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String mealTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.meal_accompanys
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String mealAccompanys;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.canteen_health
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String canteenHealth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.food_quality
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String foodQuality;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.meal_number
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String mealNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.staff_attitude
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String staffAttitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.staff_specifications
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String staffSpecifications;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.total_satisfaction
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String totalSatisfaction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.dining_window
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String diningWindow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.meal_record
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String mealRecord;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.dining_environment
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String diningEnvironment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.operator
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.operator_ip
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private String operatorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accompany_record.operator_time
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    private Date operatorTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.id
     *
     * @return the value of accompany_record.id
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.id
     *
     * @param id the value for accompany_record.id
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.enterprise_id
     *
     * @return the value of accompany_record.enterprise_id
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.enterprise_id
     *
     * @param enterpriseId the value for accompany_record.enterprise_id
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.meal_date
     *
     * @return the value of accompany_record.meal_date
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public Date getMealDate() {
        return mealDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.meal_date
     *
     * @param mealDate the value for accompany_record.meal_date
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setMealDate(Date mealDate) {
        this.mealDate = mealDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.meal_time
     *
     * @return the value of accompany_record.meal_time
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getMealTime() {
        return mealTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.meal_time
     *
     * @param mealTime the value for accompany_record.meal_time
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setMealTime(String mealTime) {
        this.mealTime = mealTime == null ? null : mealTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.meal_accompanys
     *
     * @return the value of accompany_record.meal_accompanys
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getMealAccompanys() {
        return mealAccompanys;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.meal_accompanys
     *
     * @param mealAccompanys the value for accompany_record.meal_accompanys
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setMealAccompanys(String mealAccompanys) {
        this.mealAccompanys = mealAccompanys == null ? null : mealAccompanys.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.canteen_health
     *
     * @return the value of accompany_record.canteen_health
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getCanteenHealth() {
        return canteenHealth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.canteen_health
     *
     * @param canteenHealth the value for accompany_record.canteen_health
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setCanteenHealth(String canteenHealth) {
        this.canteenHealth = canteenHealth == null ? null : canteenHealth.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.food_quality
     *
     * @return the value of accompany_record.food_quality
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getFoodQuality() {
        return foodQuality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.food_quality
     *
     * @param foodQuality the value for accompany_record.food_quality
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setFoodQuality(String foodQuality) {
        this.foodQuality = foodQuality == null ? null : foodQuality.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.meal_number
     *
     * @return the value of accompany_record.meal_number
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getMealNumber() {
        return mealNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.meal_number
     *
     * @param mealNumber the value for accompany_record.meal_number
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setMealNumber(String mealNumber) {
        this.mealNumber = mealNumber == null ? null : mealNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.staff_attitude
     *
     * @return the value of accompany_record.staff_attitude
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getStaffAttitude() {
        return staffAttitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.staff_attitude
     *
     * @param staffAttitude the value for accompany_record.staff_attitude
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setStaffAttitude(String staffAttitude) {
        this.staffAttitude = staffAttitude == null ? null : staffAttitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.staff_specifications
     *
     * @return the value of accompany_record.staff_specifications
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getStaffSpecifications() {
        return staffSpecifications;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.staff_specifications
     *
     * @param staffSpecifications the value for accompany_record.staff_specifications
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setStaffSpecifications(String staffSpecifications) {
        this.staffSpecifications = staffSpecifications == null ? null : staffSpecifications.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.total_satisfaction
     *
     * @return the value of accompany_record.total_satisfaction
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getTotalSatisfaction() {
        return totalSatisfaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.total_satisfaction
     *
     * @param totalSatisfaction the value for accompany_record.total_satisfaction
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setTotalSatisfaction(String totalSatisfaction) {
        this.totalSatisfaction = totalSatisfaction == null ? null : totalSatisfaction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.dining_window
     *
     * @return the value of accompany_record.dining_window
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getDiningWindow() {
        return diningWindow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.dining_window
     *
     * @param diningWindow the value for accompany_record.dining_window
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setDiningWindow(String diningWindow) {
        this.diningWindow = diningWindow == null ? null : diningWindow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.meal_record
     *
     * @return the value of accompany_record.meal_record
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getMealRecord() {
        return mealRecord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.meal_record
     *
     * @param mealRecord the value for accompany_record.meal_record
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setMealRecord(String mealRecord) {
        this.mealRecord = mealRecord == null ? null : mealRecord.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.dining_environment
     *
     * @return the value of accompany_record.dining_environment
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getDiningEnvironment() {
        return diningEnvironment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.dining_environment
     *
     * @param diningEnvironment the value for accompany_record.dining_environment
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setDiningEnvironment(String diningEnvironment) {
        this.diningEnvironment = diningEnvironment == null ? null : diningEnvironment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.operator
     *
     * @return the value of accompany_record.operator
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.operator
     *
     * @param operator the value for accompany_record.operator
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.operator_ip
     *
     * @return the value of accompany_record.operator_ip
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public String getOperatorIp() {
        return operatorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.operator_ip
     *
     * @param operatorIp the value for accompany_record.operator_ip
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accompany_record.operator_time
     *
     * @return the value of accompany_record.operator_time
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public Date getOperatorTime() {
        return operatorTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accompany_record.operator_time
     *
     * @param operatorTime the value for accompany_record.operator_time
     *
     * @mbg.generated Wed Sep 30 22:04:05 CST 2020
     */
    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }
}