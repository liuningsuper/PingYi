package com.example.upc.dao;

import com.example.upc.dataobject.ViewQuickCheckTotalPercent;

import java.util.List;

public interface ViewQuickCheckTotalPercentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_quick_check_total_percent
     *
     * @mbg.generated Fri Aug 09 22:31:55 CST 2019
     */
    int insert(ViewQuickCheckTotalPercent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_quick_check_total_percent
     *
     * @mbg.generated Fri Aug 09 22:31:55 CST 2019
     */
    int insertSelective(ViewQuickCheckTotalPercent record);
    List<ViewQuickCheckTotalPercent> getListAll();
}