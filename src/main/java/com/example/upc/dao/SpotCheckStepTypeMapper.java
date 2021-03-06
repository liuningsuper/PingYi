package com.example.upc.dao;

import com.example.upc.controller.param.PageQuery;
import com.example.upc.dataobject.SpotCheckStepType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpotCheckStepTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_step_type
     *
     * @mbg.generated Thu Aug 08 16:04:33 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_step_type
     *
     * @mbg.generated Thu Aug 08 16:04:33 CST 2019
     */
    int insert(SpotCheckStepType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_step_type
     *
     * @mbg.generated Thu Aug 08 16:04:33 CST 2019
     */
    int insertSelective(SpotCheckStepType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_step_type
     *
     * @mbg.generated Thu Aug 08 16:04:33 CST 2019
     */
    SpotCheckStepType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_step_type
     *
     * @mbg.generated Thu Aug 08 16:04:33 CST 2019
     */
    int updateByPrimaryKeySelective(SpotCheckStepType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spot_check_step_type
     *
     * @mbg.generated Thu Aug 08 16:04:33 CST 2019
     */
    int updateByPrimaryKey(SpotCheckStepType record);
    int countList();
    List<SpotCheckStepType> getPage(@Param("page") PageQuery page);
    int countByType(@Param("Type") String Type, @Param("Id") Integer Id);
}