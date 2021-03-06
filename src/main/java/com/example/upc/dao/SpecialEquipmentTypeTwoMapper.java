package com.example.upc.dao;

import com.example.upc.controller.param.PageQuery;
import com.example.upc.controller.searchParam.MeasurementSearchParam;
import com.example.upc.dataobject.SpecialEquipmentTypeTwo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialEquipmentTypeTwoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_equipment_type_two
     *
     * @mbg.generated Mon Oct 21 20:16:05 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_equipment_type_two
     *
     * @mbg.generated Mon Oct 21 20:16:05 CST 2019
     */
    int insert(SpecialEquipmentTypeTwo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_equipment_type_two
     *
     * @mbg.generated Mon Oct 21 20:16:05 CST 2019
     */
    int insertSelective(SpecialEquipmentTypeTwo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_equipment_type_two
     *
     * @mbg.generated Mon Oct 21 20:16:05 CST 2019
     */
    SpecialEquipmentTypeTwo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_equipment_type_two
     *
     * @mbg.generated Mon Oct 21 20:16:05 CST 2019
     */
    int updateByPrimaryKeySelective(SpecialEquipmentTypeTwo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_equipment_type_two
     *
     * @mbg.generated Mon Oct 21 20:16:05 CST 2019
     */
    int updateByPrimaryKey(SpecialEquipmentTypeTwo record);

    int countList(@Param("search") MeasurementSearchParam search);
    List<SpecialEquipmentTypeTwo> getPage(@Param("page") PageQuery page, @Param("search") MeasurementSearchParam search);
    int countListByParent(@Param("parent") String parent, @Param("search") MeasurementSearchParam search);
    List<SpecialEquipmentTypeTwo> getPageByParent(@Param("page") PageQuery page, @Param("parent") String parent, @Param("search") MeasurementSearchParam search);
    int countByName(@Param("Parent") String Parent, @Param("Name") String Name,@Param("Id") Integer Id);
}