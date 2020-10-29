package com.example.upc.controller.param;

import java.util.Date;

public class GridGrid1 {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grid_grid.id
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grid_grid.parent_id
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    private Integer parentId;

    private String level;
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grid_grid.polygon
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    private String polygon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grid_grid.color
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    private String color;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grid_grid.border
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    private Integer border;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grid_grid.area_id
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    private Integer areaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grid_grid.center
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    private String center;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grid_grid.operator
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grid_grid.operate_time
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    private Date operateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grid_grid.operate_ip
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    private String operateIp;

    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grid_grid.id
     *
     * @return the value of grid_grid.id
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grid_grid.id
     *
     * @param id the value for grid_grid.id
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grid_grid.parent_id
     *
     * @return the value of grid_grid.parent_id
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grid_grid.parent_id
     *
     * @param parentId the value for grid_grid.parent_id
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grid_grid.polygon
     *
     * @return the value of grid_grid.polygon
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public String getPolygon() {
        return polygon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grid_grid.polygon
     *
     * @param polygon the value for grid_grid.polygon
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public void setPolygon(String polygon) {
        this.polygon = polygon == null ? null : polygon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grid_grid.color
     *
     * @return the value of grid_grid.color
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grid_grid.color
     *
     * @param color the value for grid_grid.color
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grid_grid.border
     *
     * @return the value of grid_grid.border
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public Integer getBorder() {
        return border;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grid_grid.border
     *
     * @param border the value for grid_grid.border
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public void setBorder(Integer border) {
        this.border = border;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grid_grid.area_id
     *
     * @return the value of grid_grid.area_id
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public Integer getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grid_grid.area_id
     *
     * @param areaId the value for grid_grid.area_id
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grid_grid.center
     *
     * @return the value of grid_grid.center
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public String getCenter() {
        return center;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grid_grid.center
     *
     * @param center the value for grid_grid.center
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public void setCenter(String center) {
        this.center = center == null ? null : center.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grid_grid.operator
     *
     * @return the value of grid_grid.operator
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grid_grid.operator
     *
     * @param operator the value for grid_grid.operator
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grid_grid.operate_time
     *
     * @return the value of grid_grid.operate_time
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grid_grid.operate_time
     *
     * @param operateTime the value for grid_grid.operate_time
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grid_grid.operate_ip
     *
     * @return the value of grid_grid.operate_ip
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public String getOperateIp() {
        return operateIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grid_grid.operate_ip
     *
     * @param operateIp the value for grid_grid.operate_ip
     *
     * @mbg.generated Tue Aug 13 11:08:39 CST 2019
     */
    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp == null ? null : operateIp.trim();
    }
    public String getName(){return name;}
    public void setName(String name){this.name= name;}
}