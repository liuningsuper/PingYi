package com.example.upc.dao;

import com.example.upc.dataobject.SupervisionEnDrugsPro;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupervisionEnDrugsProMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_drugs_pro
     *
     * @mbg.generated Thu Apr 23 00:08:45 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_drugs_pro
     *
     * @mbg.generated Thu Apr 23 00:08:45 CST 2020
     */
    int insert(SupervisionEnDrugsPro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_drugs_pro
     *
     * @mbg.generated Thu Apr 23 00:08:45 CST 2020
     */
    int insertSelective(SupervisionEnDrugsPro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_drugs_pro
     *
     * @mbg.generated Thu Apr 23 00:08:45 CST 2020
     */
    SupervisionEnDrugsPro selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_drugs_pro
     *
     * @mbg.generated Thu Apr 23 00:08:45 CST 2020
     */
    int updateByPrimaryKeySelective(SupervisionEnDrugsPro record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supervision_en_drugs_pro
     *
     * @mbg.generated Thu Apr 23 00:08:45 CST 2020
     */
    int updateByPrimaryKey(SupervisionEnDrugsPro record);

    List<SupervisionEnDrugsPro> getListByEnterpriseId(@Param("enterpriseId") int eid);
    List<SupervisionEnDrugsPro> getAll();
    void deleteByIndexId(@Param("iid") int iid);

}