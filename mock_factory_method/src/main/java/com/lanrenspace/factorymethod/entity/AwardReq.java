package com.lanrenspace.factorymethod.entity;

import java.io.Serializable;

/**
 * @Author lanrenspace@163.com
 * @Description: 发奖请求
 **/
public class AwardReq implements Serializable {

    /**
     * 用户ID
     */
    private String userId;


    /**
     * 发奖类型
     */
    private Integer awardType;

    public AwardReq(Integer awardType) {
        this.awardType = awardType;
        this.userId = "10001";
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }
}
