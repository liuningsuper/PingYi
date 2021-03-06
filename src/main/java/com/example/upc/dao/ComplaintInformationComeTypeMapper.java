package com.example.upc.dao;

import com.example.upc.controller.param.PageQuery;
import com.example.upc.controller.searchParam.ComplaintSearchParam;
import com.example.upc.dataobject.ComplaintInformationComeType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComplaintInformationComeTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaint_information_come_type
     *
     * @mbg.generated Tue Sep 10 08:51:31 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaint_information_come_type
     *
     * @mbg.generated Tue Sep 10 08:51:31 CST 2019
     */
    int insert(ComplaintInformationComeType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaint_information_come_type
     *
     * @mbg.generated Tue Sep 10 08:51:31 CST 2019
     */
    int insertSelective(ComplaintInformationComeType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaint_information_come_type
     *
     * @mbg.generated Tue Sep 10 08:51:31 CST 2019
     */
    ComplaintInformationComeType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaint_information_come_type
     *
     * @mbg.generated Tue Sep 10 08:51:31 CST 2019
     */
    int updateByPrimaryKeySelective(ComplaintInformationComeType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table complaint_information_come_type
     *
     * @mbg.generated Tue Sep 10 08:51:31 CST 2019
     */
    int updateByPrimaryKey(ComplaintInformationComeType record);
    int countList(@Param("search") ComplaintSearchParam search);
    List<ComplaintInformationComeType> getPage(@Param("page") PageQuery page,@Param("search") ComplaintSearchParam search);
    int countByType(@Param("Type") String Type, @Param("Id") Integer Id);
    List<ComplaintInformationComeType> getPageList(@Param("search") ComplaintSearchParam search);
}