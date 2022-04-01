package com.lanrenspace.factorymethod.entity;

import java.io.Serializable;

/**
 * @Author lanrenspace@163.com
 * @Description: 发奖返回
 **/
public class AwardRes implements Serializable {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 相应消息
     */
    private String msg;

    public AwardRes() {
        this.code = 200;
        this.msg = "发放成功";
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
