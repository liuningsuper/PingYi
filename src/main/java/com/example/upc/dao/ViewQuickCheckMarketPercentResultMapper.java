package com.example.upc.dao;

import com.example.upc.dataobject.ViewQuickCheckMarketPercentResult;

import java.util.List;

public interface ViewQuickCheckMarketPercentResultMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_quick_check_market_percent_result
     *
     * @mbg.generated Sat Aug 10 00:01:59 CST 2019
     */
    int insert(ViewQuickCheckMarketPercentResult record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_quick_check_market_percent_result
     *
     * @mbg.generated Sat Aug 10 00:01:59 CST 2019
     */
    int insertSelective(ViewQuickCheckMarketPercentResult record);
    List<ViewQuickCheckMarketPercentResult> getListAll();
}