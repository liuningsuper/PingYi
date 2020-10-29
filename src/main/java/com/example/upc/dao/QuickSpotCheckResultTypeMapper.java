package com.example.upc.dao;

import com.example.upc.controller.param.PageQuery;
import com.example.upc.dataobject.QuickSpotCheckResultType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuickSpotCheckResultTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quick_spot_check_result_type
     *
     * @mbg.generated Mon Aug 05 11:14:20 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quick_spot_check_result_type
     *
     * @mbg.generated Mon Aug 05 11:14:20 CST 2019
     */
    int insert(QuickSpotCheckResultType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quick_spot_check_result_type
     *
     * @mbg.generated Mon Aug 05 11:14:20 CST 2019
     */
    int insertSelective(QuickSpotCheckResultType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quick_spot_check_result_type
     *
     * @mbg.generated Mon Aug 05 11:14:20 CST 2019
     */
    QuickSpotCheckResultType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quick_spot_check_result_type
     *
     * @mbg.generated Mon Aug 05 11:14:20 CST 2019
     */
    int updateByPrimaryKeySelective(QuickSpotCheckResultType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table quick_spot_check_result_type
     *
     * @mbg.generated Mon Aug 05 11:14:20 CST 2019
     */
    int updateByPrimaryKey(QuickSpotCheckResultType record);
    int countList();
    List<QuickSpotCheckResultType> getPage(@Param("page") PageQuery page);
    int countByType(@Param("Type") String Type, @Param("Id") Integer Id);
}