package com.example.upc.dao;

import com.example.upc.controller.param.FormatGoodsSupParam;
import com.example.upc.controller.param.PageQuery;
import com.example.upc.controller.searchParam.GoodsSearchParam;
import com.example.upc.dataobject.FormatGoodsIn;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FormatGoodsInMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_goods_in
     *
     * @mbg.generated Mon Sep 02 12:02:59 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_goods_in
     *
     * @mbg.generated Mon Sep 02 12:02:59 CST 2019
     */
    int insert(FormatGoodsIn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_goods_in
     *
     * @mbg.generated Mon Sep 02 12:02:59 CST 2019
     */
    int insertSelective(FormatGoodsIn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_goods_in
     *
     * @mbg.generated Mon Sep 02 12:02:59 CST 2019
     */
    FormatGoodsIn selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_goods_in
     *
     * @mbg.generated Mon Sep 02 12:02:59 CST 2019
     */
    int updateByPrimaryKeySelective(FormatGoodsIn record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table format_goods_in
     *
     * @mbg.generated Mon Sep 02 12:02:59 CST 2019
     */
    int updateByPrimaryKey(FormatGoodsIn record);
    void batchInsert(@Param("formatGoodsInList") List<FormatGoodsIn> formatGoodsInList);
    void batchInsertEx(@Param("formatGoodsInList") List<FormatGoodsIn> formatGoodsInList);
    int countList(@Param("enterprise") Integer enterprise, @Param("search") GoodsSearchParam search);
    List<FormatGoodsIn> getPage(@Param("page") PageQuery page, @Param("enterprise") Integer enterprise, @Param("search") GoodsSearchParam search);
    int countListSup(@Param("search") GoodsSearchParam search);
    List<FormatGoodsSupParam> getPageSup(@Param("page") PageQuery page, @Param("search") GoodsSearchParam search);
    int countListAdmin(@Param("search") GoodsSearchParam search);
    List<FormatGoodsSupParam> getPageAdmin(@Param("page") PageQuery page, @Param("search") GoodsSearchParam search);
}