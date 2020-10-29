package com.example.upc.dao;

import com.example.upc.dataobject.SupervisionEnSmallCaterIndex;
import com.example.upc.dataobject.SupervisionEnSmallWorkshopIndex;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupervisionEnSmallWorkshopIndexMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_small_workshop_index
     *
     * @mbg.generated Fri Apr 24 17:32:44 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_small_workshop_index
     *
     * @mbg.generated Fri Apr 24 17:32:44 CST 2020
     */
    int insert(SupervisionEnSmallWorkshopIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_small_workshop_index
     *
     * @mbg.generated Fri Apr 24 17:32:44 CST 2020
     */
    int insertSelective(SupervisionEnSmallWorkshopIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_small_workshop_index
     *
     * @mbg.generated Fri Apr 24 17:32:44 CST 2020
     */
    SupervisionEnSmallWorkshopIndex selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_small_workshop_index
     *
     * @mbg.generated Fri Apr 24 17:32:44 CST 2020
     */
    int updateByPrimaryKeySelective(SupervisionEnSmallWorkshopIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_small_workshop_index
     *
     * @mbg.generated Fri Apr 24 17:32:44 CST 2020
     */
    int updateByPrimaryKey(SupervisionEnSmallWorkshopIndex record);

    SupervisionEnSmallWorkshopIndex selectByEnterpriseId(@Param("eid") Integer eid);
    List<SupervisionEnSmallWorkshopIndex> getAll();
    int deleteByEnterpriseId(@Param("eid") Integer eid);
}