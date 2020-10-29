package com.example.upc.dao;

import com.example.upc.controller.param.FormatOriginRecordEnParam;
import com.example.upc.controller.param.FormatOriginRecordSupParam;
import com.example.upc.controller.param.PageQuery;
import com.example.upc.controller.searchParam.OriginRecordSearchParam;
import com.example.upc.dataobject.FormatOriginRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FormatOriginRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_origin_record
     *
     * @mbg.generated Tue Jul 23 14:28:33 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_origin_record
     *
     * @mbg.generated Tue Jul 23 14:28:33 CST 2019
     */
    int insert(FormatOriginRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_origin_record
     *
     * @mbg.generated Tue Jul 23 14:28:33 CST 2019
     */
    int insertSelective(FormatOriginRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_origin_record
     *
     * @mbg.generated Tue Jul 23 14:28:33 CST 2019
     */
    FormatOriginRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_origin_record
     *
     * @mbg.generated Tue Jul 23 14:28:33 CST 2019
     */
    int updateByPrimaryKeySelective(FormatOriginRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_origin_record
     *
     * @mbg.generated Tue Jul 23 14:28:33 CST 2019
     */
    int updateByPrimaryKey(FormatOriginRecord record);
    int countList();
    int countListSup(@Param("search") OriginRecordSearchParam search);
    List<FormatOriginRecordSupParam> getPage(@Param("page") PageQuery page, @Param("search") OriginRecordSearchParam search);
    int countListEnterprise(@Param("enterprise") Integer enterprise, @Param("search") OriginRecordSearchParam search);
    List<FormatOriginRecordEnParam> getPageEnterprise(@Param("page") PageQuery page, @Param("enterprise") Integer enterprise, @Param("search") OriginRecordSearchParam search);
}