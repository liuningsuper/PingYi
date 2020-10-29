package com.example.upc.dataobject;

import java.math.BigDecimal;

public class ViewSpotCheckTeamSumResult {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_spot_check_team_sum_result.team
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    private String team;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_spot_check_team_sum_result.total
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    private BigDecimal total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_spot_check_team_sum_result.yes
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    private BigDecimal yes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_spot_check_team_sum_result.no
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    private BigDecimal no;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_spot_check_team_sum_result.percent
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    private String percent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_spot_check_team_sum_result.team
     *
     * @return the value of view_spot_check_team_sum_result.team
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    public String getTeam() {
        return team;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_spot_check_team_sum_result.team
     *
     * @param team the value for view_spot_check_team_sum_result.team
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_spot_check_team_sum_result.total
     *
     * @return the value of view_spot_check_team_sum_result.total
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_spot_check_team_sum_result.total
     *
     * @param total the value for view_spot_check_team_sum_result.total
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_spot_check_team_sum_result.yes
     *
     * @return the value of view_spot_check_team_sum_result.yes
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    public BigDecimal getYes() {
        return yes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_spot_check_team_sum_result.yes
     *
     * @param yes the value for view_spot_check_team_sum_result.yes
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    public void setYes(BigDecimal yes) {
        this.yes = yes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_spot_check_team_sum_result.no
     *
     * @return the value of view_spot_check_team_sum_result.no
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    public BigDecimal getNo() {
        return no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_spot_check_team_sum_result.no
     *
     * @param no the value for view_spot_check_team_sum_result.no
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    public void setNo(BigDecimal no) {
        this.no = no;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_spot_check_team_sum_result.percent
     *
     * @return the value of view_spot_check_team_sum_result.percent
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    public String getPercent() {
        return percent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_spot_check_team_sum_result.percent
     *
     * @param percent the value for view_spot_check_team_sum_result.percent
     *
     * @mbg.generated Thu Aug 15 09:47:12 CST 2019
     */
    public void setPercent(String percent) {
        this.percent = percent == null ? null : percent.trim();
    }
}