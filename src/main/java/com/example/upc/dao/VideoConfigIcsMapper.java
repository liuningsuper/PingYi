package com.example.upc.dao;

import com.example.upc.dataobject.VideoConfigIcs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoConfigIcsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_config_ics
     *
     * @mbg.generated Thu Nov 07 11:21:19 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_config_ics
     *
     * @mbg.generated Thu Nov 07 11:21:19 CST 2019
     */
    int insert(VideoConfigIcs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_config_ics
     *
     * @mbg.generated Thu Nov 07 11:21:19 CST 2019
     */
    int insertSelective(VideoConfigIcs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_config_ics
     *
     * @mbg.generated Thu Nov 07 11:21:19 CST 2019
     */
    VideoConfigIcs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_config_ics
     *
     * @mbg.generated Thu Nov 07 11:21:19 CST 2019
     */
    int updateByPrimaryKeySelective(VideoConfigIcs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table video_config_ics
     *
     * @mbg.generated Thu Nov 07 11:21:19 CST 2019
     */
    int updateByPrimaryKey(VideoConfigIcs record);

    List<VideoConfigIcs> selectByParentId(@Param("id") int id);
    void deleteByParentId(@Param("parentId") int parentId);
    void batchInsert(@Param("videoConfigIcsList") List<VideoConfigIcs> videoConfigIcsList);
}