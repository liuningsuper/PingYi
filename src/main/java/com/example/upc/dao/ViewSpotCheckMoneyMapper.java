package com.example.upc.dao;

import com.example.upc.dataobject.ViewSpotCheckMoney;

import java.util.List;

public interface ViewSpotCheckMoneyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_spot_check_money
     *
     * @mbg.generated Thu Aug 08 10:51:28 CST 2019
     */
    int insert(ViewSpotCheckMoney record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_spot_check_money
     *
     * @mbg.generated Thu Aug 08 10:51:28 CST 2019
     */
    int insertSelective(ViewSpotCheckMoney record);
    List<ViewSpotCheckMoney> getListAll();
}