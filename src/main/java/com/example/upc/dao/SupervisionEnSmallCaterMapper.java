package com.example.upc.dao;

import com.example.upc.dataobject.SupervisionEnSmallCater;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupervisionEnSmallCaterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_small_cater
     *
     * @mbg.generated Fri Apr 24 17:32:01 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_small_cater
     *
     * @mbg.generated Fri Apr 24 17:32:01 CST 2020
     */
    int insert(SupervisionEnSmallCater record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_small_cater
     *
     * @mbg.generated Fri Apr 24 17:32:01 CST 2020
     */
    int insertSelective(SupervisionEnSmallCater record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_small_cater
     *
     * @mbg.generated Fri Apr 24 17:32:01 CST 2020
     */
    SupervisionEnSmallCater selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_small_cater
     *
     * @mbg.generated Fri Apr 24 17:32:01 CST 2020
     */
    int updateByPrimaryKeySelective(SupervisionEnSmallCater record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_small_cater
     *
     * @mbg.generated Fri Apr 24 17:32:01 CST 2020
     */
    int updateByPrimaryKey(SupervisionEnSmallCater record);

    List<SupervisionEnSmallCater> getListByEnterpriseId(@Param("enterpriseId") int eid);

    List<SupervisionEnSmallCater> getAll();
    void deleteByIndexId(@Param("iid") int iid);
}