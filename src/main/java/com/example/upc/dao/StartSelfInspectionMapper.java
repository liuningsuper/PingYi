package com.example.upc.dao;

import com.example.upc.controller.searchParam.InspectionSearchParam;
import com.example.upc.dataobject.StartSelfInspection;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StartSelfInspectionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_self_inspection
     *
     * @mbg.generated Sun Sep 06 21:01:46 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_self_inspection
     *
     * @mbg.generated Sun Sep 06 21:01:46 CST 2020
     */
    int insert(StartSelfInspection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_self_inspection
     *
     * @mbg.generated Sun Sep 06 21:01:46 CST 2020
     */
    int insertSelective(StartSelfInspection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_self_inspection
     *
     * @mbg.generated Sun Sep 06 21:01:46 CST 2020
     */
    StartSelfInspection selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_self_inspection
     *
     * @mbg.generated Sun Sep 06 21:01:46 CST 2020
     */
    int updateByPrimaryKeySelective(StartSelfInspection record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table start_self_inspection
     *
     * @mbg.generated Sun Sep 06 21:01:46 CST 2020
     */
    int updateByPrimaryKey(StartSelfInspection record);

    List<StartSelfInspection> getByEnterpriseId(@Param("inspectionSearchParam") InspectionSearchParam inspectionSearchParam, @Param("id") int id);

    void deleteByPosition(Integer id);

    List<StartSelfInspection> getInspectionByPosition(int positionId);
}